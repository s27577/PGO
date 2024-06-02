import java.util.ArrayList;
import java.util.List;

public class Student {
    //zmienne
    private String firstName;
    private String lastName;
    private String indexNumber;
    private String email;
    private String address;
    private List<Double> grades;

    //konstruktor
    public Student(String firstName, String lastName, String indexNumber, String email, String address, List<Double> grades) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.indexNumber = indexNumber;
        this.email = email;
        this.address = address;
        this.grades = grades;
    }

    //metody
    public double calculateGradesAverage() {
        double sum = 0;
        double average = 0;
        if (grades.isEmpty()) {
            throw new IllegalArgumentException("Student has no grades");
        } else if (grades.size() > 20) {
            throw new IllegalArgumentException("Student has more than 20 grades");
        } else {
            for (double grade : grades) {
                sum += grade;
            }
            average = sum / grades.size();
        }
        return roundToNearestHalf(average);
    }
    private double roundToNearestHalf(double value) {
        return Math.round(value * 2) / 2.0;
    }
}
