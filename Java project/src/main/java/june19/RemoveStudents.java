package june19;

import java.util.ArrayList;

public class RemoveStudents {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("John", "Doe", 3.5));
        students.add(new Student("Jane", "Smith", 3.2));
        students.add(new Student("David", "Johnson", 3.8));
        students.add(new Student("Emily", "Davis", 3.9));


        double totalGPA = 0;
        for (Student student : students) {
            totalGPA += student.getGPA();
        }
        double averageGPA = totalGPA / students.size();

        ArrayList<Student> remainingStudents = new ArrayList<>();
        for (Student student : students) {
            if (student.getGPA() >= averageGPA) {
                remainingStudents.add(student);
            }
        }

        for (Student student : remainingStudents) {
            System.out.println(student.getFirstName() + " " + student.getLastName());
        }
    }
}

class Student {
    private String firstName;
    private String lastName;
    private double GPA;

    public Student(String firstName, String lastName, double GPA) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.GPA = GPA;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getGPA() {
        return GPA;
    }
}

