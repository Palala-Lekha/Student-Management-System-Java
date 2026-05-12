import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentService service = new StudentService();

        while(true){

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Find Topper");
            System.out.println("4. Search Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice = scanner.nextInt();

            switch(choice){

                case 1:

                    System.out.print("Enter ID: ");
                    int id = scanner.nextInt();

                    scanner.nextLine();

                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Age: ");
                    int age = scanner.nextInt();

                    System.out.print("Enter Marks: ");
                    double marks = scanner.nextDouble();

                    Student student = new Student(id, name, age, marks);

                    service.addStudent(student);

                    break;

                case 2:

                    service.viewStudents();

                    break;

                case 3:

                    service.findTopper();

                    break;

                case 4:

                    scanner.nextLine();

                    System.out.print("Enter Student Name: ");

                    String searchName = scanner.nextLine();

                    service.searchStudent(searchName);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");

                    int deleteId = scanner.nextInt();

                    service.deleteStudent(deleteId);

                    break;

                case 6:

                    System.out.println("Exiting Application");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}