
package Model;

public class Student {
    private String studentID;
    private String name;
    private String studentClass;
    private boolean sex;
    private float GPA;

    // Hàm khởi tạo không tham số.
    public Student() {
    }

    // Hàm khởi tạo 5 tham số.
    public Student(String studentID, String name, String Class, boolean sex, float GPA) {
        this.studentID = studentID;
        this.name = name;
        this.studentClass = Class;
        this.sex = sex;
        this.GPA = GPA;
    }
    // Hàm khởi tạo 4 tham số.
    public Student(String studentID, String name, String studentClass, boolean sex) {
        this.studentID = studentID;
        this.name = name;
        this.studentClass = studentClass;
        this.sex = sex;
    }

    
    // Hàm getter setter
    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getStudentClass() {
        return studentClass;
    }
    public void setClass(String Class) {
        this.studentClass = Class;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public float getGPA() {
        return GPA;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }
    
    
    // Hàm nối chuỗi. 
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", name=" + name + ", studentClass=" + studentClass + ", sex=" + sex + ", GPA=" + GPA + '}';
    }
    
    
}
