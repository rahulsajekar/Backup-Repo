// Template of student
// updating personal details
// checking fee for  the course
// displaying records of students

abstract public class Student {
    private String name, email_id,course,branch;
    private int roll_no;
    private float course_fee = 45000.00f;

    public Student(String name, String email_ID, String course, String branch, int roll_no) {
        this.name = name;
        this.email_id = email_ID;
        this.course = course;
        this.branch = branch;
        this.roll_no = roll_no;
    }

    public Student(){

    }

    public Student(String name, String email_id, String address, String course, String branch, int rollno) {
    }

    @Override
    // specifies the representation of student object
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", email_ID='" + email_id + '\'' +
                ", course='" + course + '\'' +
                ", branch='" + branch + '\'' +
                ", roll_no=" + roll_no +
                ", course_fee=" + course_fee +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    public float getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(float course_fee) {
        this.course_fee = course_fee;
    }
}
