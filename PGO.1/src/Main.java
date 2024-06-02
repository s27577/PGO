import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Jacek", "Kowalski", "s27577", "jkowalski@gmail.com", "Warszawa", Arrays.asList(2.5, 3.5, 4.5, 5.0));
        StudentGroup A = new StudentGroup("A");

        double average1 = student1.calculateGradesAverage();
        System.out.println(average1);

        A.addStudent(student1);
        }
    }
