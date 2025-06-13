package am.order.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2_4_5_6 {
    public static void main(String[] args) {

        Student student1 = new Student("Ani", 58);
        Student student2 = new Student("Sevak", 96);
        Student student3 = new Student("Gor", 78);
        Student student4 = new Student("Karine", 98);
        Student student5 = new Student("Marianna", 68);
        Student student6 = new Student("Robert", 95);
        Student student7 = new Student("Artak", 46);

        //Խնդիր 2. Դասավորել ուսանողներին ըստ գնահատականի

        ArrayList<Student> students = new ArrayList<>(Arrays.asList(student1, student2, student3, student4, student5, student6, student7));
        Collections.sort(students);
        System.out.println(students);

        System.out.println("--------------------------------");

        //Խնդիր 4. Ֆիլտրել և տպել այն ուսանողներին, ովքեր ունեն գնահատական > 85

        for (Student student : students) {
            if (student.getGrade() > 85) {
                System.out.println("The grade of this student is bigger then 85 " + student);
                System.out.println();
            }
        }

        System.out.println("---------------------------------------");

        //Խնդիր 5. Ստուգել՝ արդյոք ուսանողների Լիստում կա  “David” անունով ուսանող

        boolean isFound = false;
        for (Student student : students) {
            if (student.getName().equals("Davit")) {
                System.out.println("There are students named Davit");
                isFound = true;
                break;
            }
        }
        if (isFound == false) {
            System.out.println("There are no students named Davit");
        }

        System.out.println("---------------------------------------");


        //Խնդիր 6. Լիստից հեռացնել բոլոր ուսանողներին, ովքեր ստացել են 60-ից ցածր գնահատական

        students.removeIf(student -> student.getGrade() < 60);
        System.out.println(students);
    }
}





