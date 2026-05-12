import java.util.ArrayList;

public class StudentService {

    ArrayList<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){

        studentList.add(student);

        System.out.println("Student Added Successfully");
    }

    public void viewStudents(){

        if(studentList.isEmpty()){

            System.out.println("No Students Found");
            return;
        }

        for(Student student : studentList){

            student.displayStudent();

            System.out.println("----------------");
        }
    }

    public void findTopper(){

        if(studentList.isEmpty()){

            System.out.println("No Students Found");
            return;
        }

        Student topper = studentList.get(0);

        for(Student student : studentList){

            if(student.marks > topper.marks){

                topper = student;
            }
        }

        System.out.println("Topper Details:");

        topper.displayStudent();
    }

    public void searchStudent(String studentName){

        boolean found = false;

        for(Student student : studentList){

            if(student.name.equalsIgnoreCase(studentName)){

                student.displayStudent();

                found = true;
            }
        }

        if(!found){

            System.out.println("Student Not Found");
        }
    }

    public void deleteStudent(int studentId){

        for(Student student : studentList){

            if(student.id == studentId){

                studentList.remove(student);

                System.out.println("Student Deleted Successfully");

                return;
            }
        }

        System.out.println("Student Not Found");
    }
}