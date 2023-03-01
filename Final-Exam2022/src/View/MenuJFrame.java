
package View;

import Cotroller.MenuController;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MenuJFrame extends javax.swing.JFrame {

    public MenuJFrame() {
        setVisible(true);
        initComponents();
        setLocationRelativeTo(null);
        // Action
        ActionListener act = new MenuController(this);
        btDelete.addActionListener(act);
        btFind.addActionListener(act);
        btExit.addActionListener(act);
        btInsert.addActionListener(act);
        btShowAll.addActionListener(act);
        btReset.addActionListener(act);
        btUpdate.addActionListener(act);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbStudent = new javax.swing.JTable();
        btInsert = new javax.swing.JButton();
        btDelete = new javax.swing.JButton();
        btUpdate = new javax.swing.JButton();
        btExit = new javax.swing.JButton();
        btShowAll = new javax.swing.JButton();
        lBTitle = new javax.swing.JLabel();
        btFind = new javax.swing.JButton();
        lBID = new javax.swing.JLabel();
        lBName = new javax.swing.JLabel();
        lBClass = new javax.swing.JLabel();
        lBSex = new javax.swing.JLabel();
        lBGPA = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfClass = new javax.swing.JTextField();
        tfGPA = new javax.swing.JTextField();
        rdMale = new javax.swing.JRadioButton();
        rdFemale = new javax.swing.JRadioButton();
        btReset = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student management by Tấn Lam");

        tbStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Name", "Class", "Sex", "GPA"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbStudent);

        btInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Save-icon.png"))); // NOI18N
        btInsert.setText("Insert");

        btDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btDelete.setText("Delete");

        btUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-document-edit-icon-16.png"))); // NOI18N
        btUpdate.setText("Update");

        btExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Button-Close-icon-16.png"))); // NOI18N
        btExit.setText("Exit");

        btShowAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/open-file-icon-16.png"))); // NOI18N
        btShowAll.setText("Show all");

        lBTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lBTitle.setForeground(new java.awt.Color(102, 102, 255));
        lBTitle.setText("STUDENT MANAGEMENT");

        btFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/search-icon-16.png"))); // NOI18N
        btFind.setText("Find");

        lBID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBID.setText("Student ID: ");

        lBName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBName.setText("Name:");

        lBClass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBClass.setText("Class:");

        lBSex.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBSex.setText("Sex:");

        lBGPA.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lBGPA.setText("GPA: ");

        buttonGroup1.add(rdMale);
        rdMale.setText("Male");

        buttonGroup1.add(rdFemale);
        rdFemale.setText("Female");

        btReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/Actions-edit-delete-icon-16.png"))); // NOI18N
        btReset.setText("Reset");
        btReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btResetActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icon/10207-man-student-light-skin-tone-icon-64.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lBGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBSex, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBClass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBID)
                    .addComponent(lBName, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(rdMale)
                                .addGap(128, 128, 128)
                                .addComponent(rdFemale)
                                .addGap(120, 120, 120))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btFind, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btShowAll)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(btExit, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 407, Short.MAX_VALUE)
                            .addComponent(tfID)
                            .addComponent(tfClass)
                            .addComponent(tfGPA))
                        .addGap(196, 196, 196))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addComponent(lBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lBTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBID)
                    .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lBName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfClass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btReset, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBClass))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdFemale)
                    .addComponent(rdMale)
                    .addComponent(lBSex))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBGPA)
                    .addComponent(tfGPA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btDelete)
                    .addComponent(btInsert)
                    .addComponent(btUpdate)
                    .addComponent(btExit)
                    .addComponent(btShowAll)
                    .addComponent(btFind))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btResetActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btDelete;
    private javax.swing.JButton btExit;
    private javax.swing.JButton btFind;
    private javax.swing.JButton btInsert;
    private javax.swing.JButton btReset;
    private javax.swing.JButton btShowAll;
    private javax.swing.JButton btUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lBClass;
    private javax.swing.JLabel lBGPA;
    private javax.swing.JLabel lBID;
    private javax.swing.JLabel lBName;
    private javax.swing.JLabel lBSex;
    private javax.swing.JLabel lBTitle;
    private javax.swing.JRadioButton rdFemale;
    private javax.swing.JRadioButton rdMale;
    private javax.swing.JTable tbStudent;
    private javax.swing.JTextField tfClass;
    private javax.swing.JTextField tfGPA;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables

    public ButtonGroup getButtonGroup1() {
        return buttonGroup1;
    }

    public void setButtonGroup1(ButtonGroup buttonGroup1) {
        this.buttonGroup1 = buttonGroup1;
    }

    public JRadioButton getRdFemale() {
        return rdFemale;
    }

    public void setRdFemale(JRadioButton rdFemale) {
        this.rdFemale = rdFemale;
    }

    public JRadioButton getRdMale() {
        return rdMale;
    }

    public void setRdMale(JRadioButton rdMale) {
        this.rdMale = rdMale;
    }

    public JTextField getTfClass() {
        return tfClass;
    }

    public void setTfClass(JTextField tfClass) {
        this.tfClass = tfClass;
    }

    public JTextField getTfGPA() {
        return tfGPA;
    }

    public void setTfGPA(JTextField tfGPA) {
        this.tfGPA = tfGPA;
    }

    public JTextField getTfID() {
        return tfID;
    }

    public void setTfID(JTextField tfID) {
        this.tfID = tfID;
    }

    public JTextField getTfName() {
        return tfName;
    }

    public void setTfName(JTextField tfName) {
        this.tfName = tfName;
    }

    public JTable getTbStudent() {
        return tbStudent;
    }

    public void setTbStudent(JTable tbStudent) {
        this.tbStudent = tbStudent;
    }
    
}
