import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import studentDomen.Student;
import studentDomen.StudentGroup;
import studentDomen.Teacher;
import studentDomen.User;

public class Project {
    public static void main(String[] args) {
        Student us1 = new Student("Verenich", "Tatsiana", 34);
        Student us2 = new Student("Verenich", "Oleg", 35);
        User us3 = new Teacher("Krechko", "Larisa", 50, "OOP");
        Student us4 = new Student("Verenich", "Irina", 37);
        Student us5 = new Student("Omelko", "Anna", 32);
        Student us6 = new Student("Andreevich", "Katia", 30);

        List<Student> studList = new ArrayList<Student>();
        studList.add(us1);
        studList.add(us2);
        studList.add(us4);
        studList.add(us5);
        studList.add(us6);

        System.out.println(us3);
        StudentGroup group = new StudentGroup(studList);

        //получить студентов в виде коллекции
        Collections.sort(group.getStudents());

        System.out.println("-------------- after sorting by age --------------");
        for (Student student : group) {
            System.out.println(student);
        }

    }
}
