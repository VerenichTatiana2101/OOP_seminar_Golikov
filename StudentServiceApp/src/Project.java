import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import studentDomen.Student;
import studentDomen.StudentGroup;
// import studentDomen.Teacher;
// import studentDomen.User;
import studentDomen.StudentSteam;

public class Project {
    public static void main(String[] args) {

        // User us3 = new Teacher("Krechko", "Larisa", 50, "OOP");
        // System.out.println(us3);

        // первая группа
        Student us1 = new Student("Verenich", "Tatsiana", 34);
        Student us2 = new Student("Verenich", "Oleg", 35);
        Student us4 = new Student("Verenich", "Irina", 37);
        Student us5 = new Student("Omelko", "Anna", 32);

        List<Student> studList = new ArrayList<Student>();
        studList.add(us1);
        studList.add(us2);
        studList.add(us4);
        studList.add(us5);
        StudentGroup group = new StudentGroup(415, studList);
        ////////////////////////////

        // //получить студентов в виде коллекции
        // Collections.sort(group.getStudents());

        // System.out.println("-------------- after sorting by age --------------");
        // for (Student student : group) {
        // System.out.println(student);
        // }

        //// вторая группа
        Student st1 = new Student("Petya", "Perov", 23);
        Student st2 = new Student("Sergey", "Sergeevich", 25);
        Student st3 = new Student("Anna", "Sergeevna", 25);
        // Student st4 = new Student("Andreevich", "Katia", 30);

        List<Student> studList2 = new ArrayList<Student>();
        studList2.add(st1);
        studList2.add(st2);
        studList2.add(st3);
        // studList2.add(st4);
        StudentGroup group2 = new StudentGroup(220, studList2);
        StudentGroup group3 = new StudentGroup(320, studList2);
        ////////////////////////////

        List<StudentGroup> stGr = new ArrayList<StudentGroup>();
        stGr.add(group);
        stGr.add(group2);
        stGr.add(group3);
        StudentSteam steam = new StudentSteam(5, stGr);
        // System.out.println("------- до сортировки------");
        // for (StudentGroup students : steam) {
        // System.out.println(students);
        // }
        Collections.sort(steam.getStudSteam());

        // System.out.println("------- после сортировки------");
        // for (StudentGroup students : steam) {
        // System.out.println(students);
        // }

        System.out.println(steam.toString());

    }
}
