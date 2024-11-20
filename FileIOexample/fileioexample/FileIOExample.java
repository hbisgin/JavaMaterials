package FileIOexample;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

// Main class to read file and fill student objects
public class FileIOExample {

    public static List<Student> readStudentsFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        
        // Read file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] studentData = line.split(", ");
                if (studentData.length == 3) {
                    String name = studentData[0];
                    int age = Integer.parseInt(studentData[1]);
                    double gpa = Double.parseDouble(studentData[2]);
                    students.add(new Student(name, age, gpa));  // Create a new Student object and add to the list
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing data: " + e.getMessage());
        }
        
        return students;
    }

    public static void main(String[] args) {
        String fileName = "students.txt";  // Name of the file containing student data
        
        // Read students from file and store them in a list
        List<Student> students = readStudentsFromFile(fileName);
        
        // Display the student information
        for (Student student : students) {
            System.out.println(student);
        }
    }
}