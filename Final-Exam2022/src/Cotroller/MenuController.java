package Cotroller;

import DAO.*;
import Model.*;
import View.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuController implements ActionListener {

    private MenuJFrame menu;

    public MenuController(MenuJFrame menu) {
        this.menu = menu;
        setDataTable(StudentDAO.getInstance().showAll());
    }

    public void setDataTable(ArrayList<Student> list) {
        DefaultTableModel def = new DefaultTableModel();
        menu.getTbStudent().setModel(def);
        def.addColumn("StudentID");
        def.addColumn("Name");
        def.addColumn("Class");
        def.addColumn("Sex");
        def.addColumn("GPA");
        for (Student student : list) {
            def.addRow(new Object[]{student.getStudentID(), student.getName(), student.getStudentClass(), student.isSex(), student.getGPA()});
        }
    }

    public void setDataTable(Student student) {
        DefaultTableModel def = new DefaultTableModel();
        menu.getTbStudent().setModel(def);
        def.addColumn("StudentID");
        def.addColumn("Name");
        def.addColumn("Class");
        def.addColumn("Sex");
        def.addColumn("GPA");

        def.addRow(new Object[]{student.getStudentID(), student.getName(), student.getStudentClass(), student.isSex(), student.getGPA()});

    }

    public Student getStudentFromMenu() {
        String studentID = menu.getTfID().getText();
        if (studentID.equalsIgnoreCase("")) {
            studentID = null;
        }
        String studentName = menu.getTfName().getText();
        if (studentName.equalsIgnoreCase("")) {
            studentName = null;
        }
        String studentClass = menu.getTfClass().getText();
        if (studentClass.equalsIgnoreCase("")) {
            studentClass = null;
        }
        boolean check = false;
        boolean sex = true;
        if (menu.getRdFemale().isSelected()) {
            check = true;
            sex = false;
        } else if (menu.getRdMale().isSelected()) {
            check = true;
        }
        try {
            if (check == false) {
                throw new SexEmptyException();
            }
        } catch (SexEmptyException e) {
            JOptionPane.showMessageDialog(menu, "Sex will be default(Male)");
        }
        float GPA = -1;
        try {
            if (menu.getTfGPA().getText().equalsIgnoreCase("")) {

                throw new GPAEmptyException();
            }
            GPA = Float.parseFloat(menu.getTfGPA().getText());
            if (GPA > 4 || GPA < 0) {
                throw new GPAFormatException();
            }
        } catch (GPAFormatException a) {
            JOptionPane.showMessageDialog(menu, "GPA must be from 0 to 4");

        } catch (GPAEmptyException b) {
            JOptionPane.showMessageDialog(menu, "GPA must be not empty");
        } catch (NumberFormatException c) {
            JOptionPane.showMessageDialog(menu, "GPA must be number format!");
        }

        return new Student(studentID, studentName, studentClass, sex, GPA);
    }

    // Hàm xử lý sự kiện cho nút Reset.
    public void actionOfResetButton() {
        menu.getTfID().setText("");
        menu.getTfName().setText("");
        menu.getTfClass().setText("");
        menu.getTfGPA().setText("");
        menu.getButtonGroup1().clearSelection();
    }

    // Hàm xử lý sự kiện cho nút.  
    public void actionOfInsert() {
        Student st = getStudentFromMenu();
        if (st.getStudentID() == null) {
            JOptionPane.showMessageDialog(menu, "Student ID must be not empty!");
        } else if (st.getName() == null) {
            JOptionPane.showMessageDialog(menu, "Student name must be not empty!");
        } else if (st.getStudentClass() == null) {
            JOptionPane.showMessageDialog(menu, "Class must be not empty!");
        } else if (st.getGPA() <= 4 && st.getGPA() >= 0) {
            if (StudentDAO.getInstance().find(st) == null) {
                StudentDAO.getInstance().insert(st);
                JOptionPane.showMessageDialog(menu, "Insert sucessfull");
                setDataTable(StudentDAO.getInstance().showAll());
            } else {
                JOptionPane.showMessageDialog(menu, "ID can't duplicate");
            }
        }

    }

    // Exit
    public void actionOfExit() {

        System.exit(0);
    }

    // Hàm xử lý sự kiện update
    public void actionOfDelete() {
        String studentID = menu.getTfID().getText();
        if (studentID.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(menu, "Must be enter ID to delete");
        } else {
            boolean result = StudentDAO.getInstance().delete(new Student(studentID, null, null, true));
            if (result == false) {
                JOptionPane.showMessageDialog(menu, "Student not exist in DB");
            } else {
                JOptionPane.showMessageDialog(menu, "Delete successful");
                setDataTable(StudentDAO.getInstance().showAll());
            }
        }

    }

    // Hàm update
    public void actionOfUpdate() {
        Student st = getStudentFromMenu();
        if (st.getStudentID() == null) {
            JOptionPane.showMessageDialog(menu, "Student ID must be not empty!");
        } else if (st.getName() == null) {
            JOptionPane.showMessageDialog(menu, "Student name must be not empty!");
        } else if (st.getStudentClass() == null) {
            JOptionPane.showMessageDialog(menu, "Class must be not empty!");
        } else if (st.getGPA() <= 4 && st.getGPA() >= 0) {
            if (StudentDAO.getInstance().find(st) != null) {
                StudentDAO.getInstance().update(st);
                JOptionPane.showMessageDialog(menu, "Update sucessful");
                setDataTable(StudentDAO.getInstance().showAll());
            } else {
                JOptionPane.showMessageDialog(menu, "Not exist ID");
            }
        }

    }

    // Hàm xử lý sự kiện Find
    public void actionOfFind() {
        String studentID = menu.getTfID().getText();

        if (studentID.equalsIgnoreCase("")) {
            JOptionPane.showMessageDialog(menu, "Must be enter ID to find");
        } else {
            Student student = StudentDAO.getInstance().find(new Student(studentID, null, null, true));
            if (student == null) {
                JOptionPane.showMessageDialog(menu, "Student not exist in DB");
            } else {
                JOptionPane.showMessageDialog(menu, "Exist");
                setDataTable(student);
            }
        }
    }

    // Hàm xử lý sự kiện show all
    public void actionOfShowAll() {
        ArrayList<Student> list = new ArrayList<>();
        list = StudentDAO.getInstance().showAll();
        setDataTable(list);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();
        if (cmd.equalsIgnoreCase("Reset")) {
            actionOfResetButton();
        } else if (cmd.equalsIgnoreCase("Insert")) {
            actionOfInsert();
        } else if (cmd.equalsIgnoreCase("Exit")) {
            actionOfExit();
        } else if (cmd.equalsIgnoreCase("Delete")) {
            int result = JOptionPane.showConfirmDialog(menu, "Do you want delete this student?");
            if (result == JOptionPane.YES_OPTION) {
                actionOfDelete();
            }
        } else if (cmd.equalsIgnoreCase("Update")) {
            actionOfUpdate();
        } else if (cmd.equalsIgnoreCase("Find")) {
            actionOfFind();
        } else if (cmd.equalsIgnoreCase("Show All")) {
            actionOfShowAll();
        }
    }
}
