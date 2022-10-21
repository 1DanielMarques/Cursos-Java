package curso.application;

import curso.model.entities.Course;
import curso.model.entities.Instructor;
import curso.model.entities.Student;
import curso.model.entities.enums.CourseName;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Application {
    public static Scanner sc = new Scanner(System.in);
    public static Set<Integer> students = new HashSet<>();

    public static void main(String[] args) {

        System.out.print("Intructor name: ");
        String instructorName = sc.nextLine();
        Instructor alex = new Instructor(instructorName);
        alex.getCourses().add(new Course(CourseName.A));
        alex.getCourses().add(new Course(CourseName.B));
        alex.getCourses().add(new Course(CourseName.C));

        System.out.print("How many students for course A? ");
        int quantity = sc.nextInt();
        students(quantity, CourseName.A);

        System.out.print("How many students for course B? ");
        quantity = sc.nextInt();
        students(quantity, CourseName.B);

        System.out.print("How many students for course C? ");
        quantity = sc.nextInt();
        students(quantity, CourseName.C);


        System.out.println("Total students: " + students.size());
        sc.close();
    }

    public static void students(int quantity, CourseName courseName) {
        for (int i = 1; i <= quantity; i++) {
            int studentId = sc.nextInt();
            Student student = new Student(studentId);
            student.getCourses().add(new Course(courseName));
            students.add(student.getId());
        }
    }


}
