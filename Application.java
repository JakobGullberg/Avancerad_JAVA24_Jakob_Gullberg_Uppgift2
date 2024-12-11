import java.util.Scanner;

public class Application {
    private final StudentManagementSystem sms;
    private final Scanner scanner;

    public Application() {
        sms = StudentManagementSystem.getInstance();
        scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("\nMeny:");
            System.out.println("1. Lägg till student");
            System.out.println("2. Spara till fil");
            System.out.println("3. Läs från fil");
            System.out.println("4. Sök student via ID");
            System.out.println("5. Visa alla studenter");
            System.out.println("6. Avsluta");
            System.out.print("Välj ett alternativ: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Rensa buffer

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    saveToFile();
                    break;
                case 3:
                    readFromFile();
                    break;
                case 4:
                    searchStudentById();
                    break;
                case 5:
                    sms.displayAllStudents();
                    break;
                case 6:
                    System.out.println("Avslutar programmet.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Ogiltigt val, försök igen.");
            }
        }
    }

    private void addStudent() {
        System.out.print("Ange student-ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Rensa buffer
        System.out.print("Ange namn: ");
        String name = scanner.nextLine();
        System.out.print("Ange betyg: ");
        String grade = scanner.nextLine();
        sms.addStudent(id, name, grade);
    }

    private void saveToFile() {
        System.out.print("Ange filnamn: ");
        String filename = scanner.nextLine();
        sms.saveToFile(filename);
    }

    private void readFromFile() {
        System.out.print("Ange filnamn: ");
        String filename = scanner.nextLine();
        sms.readFromFile(filename);
    }

    private void searchStudentById() {
        System.out.print("Ange student-ID: ");
        int id = scanner.nextInt();
        Student student = sms.searchStudentById(id);
        if (student != null) {
            System.out.println("Hittad: " + student);
        } else {
            System.out.println("Student ej hittad.");
        }
    }
}

