import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    //zmienne
    private String groupName;
    private List<Student> students;

    //konstruktor
    public StudentGroup(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    //metody
    public void addStudent(Student student) {
        if (students.size() >= 15) {
            throw new IllegalStateException("Maximum amount of students in the group");
        }
        if (students.contains(student)) {
            throw new IllegalStateException("Student is already in the group");
        }
        students.add(student);
    }

}
