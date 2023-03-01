package DAO;

import Database.JDBCUtil;
import Model.Student;
import java.util.ArrayList;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class StudentDAO implements DAO<Student>{
    
    
    public StudentDAO(){
        
    }
    public static StudentDAO getInstance() {
        return new StudentDAO();
    }
    
    // Hàm thêm sinh viên vào DB
    @Override
    public boolean insert(Student t) {
        Connection conn = JDBCUtil.getConnection();
        int result = 0;
        
        String sql = "Insert into Student values (?, ?, ?, ?, ?)";
        try {
           
            
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, t.getStudentID());
            st.setString(2, t.getName());
            st.setString(3, t.getStudentClass());
            st.setBoolean(4, t.isSex());
            st.setFloat(5, t.getGPA());
    
            result = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        JDBCUtil.closeConnection(conn);
        if(result == 1) {
            return true;
        }
        return false;
    } 
    // Hàm xóa sinh viên ra khỏi DB
    @Override
    public boolean delete(Student t) {
        Connection conn = JDBCUtil.getConnection();   
        int result = 0;
        String sql = "Delete from Student where ID = ?";
        try {
            
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, t.getStudentID());
            result = st.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        JDBCUtil.closeConnection(conn);
        if(result == 0) {
            return false;
        }
        return true;
    }
    // Hàm update thông tin sinh viên.
    @Override
    public boolean update(Student t) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "Update Student set ID = ?, name = ?, class = ?, sex = ?, GPA = ? where ID = ?";
        int result = 0;
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, t.getStudentID());
            st.setString(2, t.getName());
            st.setString(3, t.getStudentClass());
            st.setBoolean(4, t.isSex());
            st.setFloat(5, t.getGPA());
            st.setString(6, t.getStudentID());
            
            result = st.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JDBCUtil.closeConnection(conn);
        if(result == 1) {
            return true;
        }
        return false;
    }
    // Hàm trả về một sinh viên cần tìm
    @Override
    public Student find(Student t) {
Connection conn = JDBCUtil.getConnection();
        
        String sql = "Select * from Student where ID = ?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, t.getStudentID());
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String studentID = rs.getString("ID");
                String name = rs.getString("name");
                String studentClass = rs.getString("class");
                Boolean sex = rs.getBoolean("sex");
                Float GPA = rs.getFloat("GPA");
                return new Student(studentID, name, studentClass, sex, GPA);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        JDBCUtil.closeConnection(conn);
        return null;
    }
    
    
//    // Hàm trả về một danh sách sinh viên của bảng sinh viên
    @Override
    public ArrayList<Student> showAll() {
        Connection conn = JDBCUtil.getConnection();
        ArrayList<Student> list =  new ArrayList<>();
        String sql = "Select * from Student";
        try {
           
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            while(rs.next()) {
                String studentID = rs.getString("ID");
                String name = rs.getString("name");
                String studentClass = rs.getString("class");
                Boolean sex = rs.getBoolean("sex");
                Float GPA = rs.getFloat("GPA");
                list.add(new Student(studentID, name, studentClass, sex, GPA));
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        JDBCUtil.closeConnection(conn);
        return list;
    }
    
}
