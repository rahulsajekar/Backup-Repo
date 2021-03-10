package InputRedirection;
// implements Comparable to compare two different students
public class Student implements Comparable<Student>{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }




    @Override
    // Compare to method return three possible values
    // 0 -> Objects are equal, no swapping required
    // negative values -> Objects is smaller, no swapping required
    // positive values -> Objects is greater, swapping required
    public int compareTo(Student student) {
        // comparison based on id
        //return this.id-student.id;

        // comparison based on name
        return this.name.compareTo(student.name);
    }
}
