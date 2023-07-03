package june20;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Student> studentMap = new HashMap<>();

        // Creating Student objects
        Student student1 = new Student("John", "Doe", 3.8);
        Student student2 = new Student("Jane", "Smith", 3.9);
        Student student3 = new Student("Michael", "Johnson", 3.7);
        Student student4 = new Student("Emily", "Davis", 4.0);
        Student student5 = new Student("David", "Brown", 3.5);
        Student student6 = new Student("Sarah", "Wilson", 3.6);
        Student student7 = new Student("Daniel", "Anderson", 3.2);
        Student student8 = new Student("Olivia", "Taylor", 3.4);

        // Adding students to the HashMap
        studentMap.put(student1.getFirstName(), student1);
        studentMap.put(student2.getFirstName(), student2);
        studentMap.put(student3.getFirstName(), student3);
        studentMap.put(student4.getFirstName(), student4);
        studentMap.put(student5.getFirstName(), student5);
        studentMap.put(student6.getFirstName(), student6);
        studentMap.put(student7.getFirstName(), student7);
        studentMap.put(student8.getFirstName(), student8);

        // Printing HashMap using Entry Set
        System.out.println("HashMap using Entry Set:");
        for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Printing HashMap using forEach method
        System.out.println("\nHashMap using forEach method:");
        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        // Printing HashMap using keySet and Iterator
        System.out.println("\nHashMap using keySet and Iterator:");
        Set<String> keySet = studentMap.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Student student = studentMap.get(key);
            System.out.println("Key: " + key + ", Value: " + student);
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

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}

