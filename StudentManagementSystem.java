import java.io.*;
import java.util.*;

public class StudentManagementSystem {

    private static StudentManagementSystem instance; // Singleton-instans
    private ArrayList<Student> students; // Datastruktur för att lagra studentposter

    private StudentManagementSystem() {
        students = new ArrayList<>(); // Valde arraylist för att det är enkelt att lägga till och iterera över element
    }

    public static StudentManagementSystem getInstance() { // Typisk implementering av Singleton-mönstret
        if (instance == null) {
            instance = new StudentManagementSystem();
        }
        return instance;
    }

    public void addStudent(int id, String name, String grade) { //Ny instans av Student skapas och läggs till i listan
        students.add(new Student(id, name, grade));
        System.out.println("Student tillagd!");
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) { //säkerställer att filen stängs automatiskt efter att operationen är klar
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getGrade());
                writer.newLine();
            }
            System.out.println("Poster sparade till fil.");
        } catch (IOException e) {
            System.err.println("Fel vid sparning till fil: " + e.getMessage());
        }
    }

    public void readFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // används för att separera data i filen baserat på kommatecken
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    String grade = parts[2];
                    students.add(new Student(id, name, grade));
                }
            }
            System.out.println("Poster lästa från fil.");
        } catch (IOException e) {
            System.err.println("Fel vid läsning från fil: " + e.getMessage());
        }
    }

    public Student searchStudentById(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("Inga studenter att visa.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
