import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import comporators.AverageAge;
import comporators.PersonComparator;
import controllers.EmploeeController;
import studentDomen.Emploee;
import studentDomen.Student;
import studentDomen.StudentGroup;
import studentDomen.Teacher;
import studentDomen.StudentSteam;
import studentDomen.User;

public class Project {
    public static void main(String[] args) {

        // User us3 = new Teacher("Krechko", "Larisa", 50, "OOP");
        // System.out.println(us3);

        // первая группа
        Student us1 = new Student(4, "Verenich", "Tatsiana", 34);
        Student us2 = new Student(5, "Verenich", "Oleg", 35);
        Student us4 = new Student(6, "Verenich", "Irina", 37);
        Student us5 = new Student(7, "Omelko", "Anna", 32);

        List<Student> studList = new ArrayList<Student>();
        studList.add(us1);
        studList.add(us2);
        studList.add(us4);
        studList.add(us5);
        StudentGroup group = new StudentGroup(415, studList);
        ////////////////////////////

        // получить студентов в виде коллекции
        Collections.sort(group.getStudents());

        System.out.println("-------------- after sorting by age --------------");
        for (Student student : group) {
            System.out.println(student);
        }

        //// вторая группа
        Student st1 = new Student(1, "Petya", "Perov", 23);
        Student st2 = new Student(2, "Sergey", "Sergeevich", 25);
        Student st3 = new Student(3, "Anna", "Sergeevna", 25);
        Student st4 = new Student(4, "Andreevich", "Katia", 30);

        List<Student> studList2 = new ArrayList<Student>();
        studList2.add(st1);
        studList2.add(st2);
        studList2.add(st3);
        studList2.add(st4);
        StudentGroup group2 = new StudentGroup(220, studList2);
        StudentGroup group3 = new StudentGroup(320, studList2);
        // ////////////////////////////

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

        System.out.println("------- после сортировки------");
        for (StudentGroup students : steam) {
            System.out.println(students);
        }

        // System.out.println(steam.toString());
        ////////////////////////////////////////////////////////////////////////
        // System.out.println(st1.compareTo(st3));

        /*
         * сравнение по фамилии в формате дженерика
         * т.к компоратор у нас класс, то создаём экземпляр класса
         */
        PersonComparator<Student> com = new PersonComparator<Student>();
        com.compare(st2, st3);

        PersonComparator<Teacher> com2 = new PersonComparator<Teacher>();
        List<Teacher> teachers = new ArrayList<>();
        Teacher t1 = new Teacher(15, "Иван", " ", 25, "Docent");
        Teacher t2 = new Teacher(17, "Игорь", " ", 23, "Professor");
        com2.compare(t1, t2);
        teachers.add(t1);
        teachers.add(t2);

        PersonComparator<User> comP = new PersonComparator<User>();
        comP.compare(st1, t2);
        // System.out.println(comP.compare(st1, t1));
        Emploee em1 = new Emploee(10, "Petya", "Perov", 23, "рабочий");

        /*
         * т.к метод в этом классе мы сделали статическим, создавать
         * экземпляр класса нет необходимости,
         * мы можем вызвать метод напрямую, обратившить к классу
         * типобезопасность тоже будет работать
         */
        // EmploeeController contr = new EmploeeController();
        // contr.paySalary(em1);
        EmploeeController.paySalary(em1);

        /*
         * после изменения наследования в классе контроллере в данном методе,
         * защиты эта строка рабоать не будет
         * мы не сможем выдать зп студенту, например
         */
        // contr.paySalary(t2);

        System.out.println(comP.compare(t1, t2));

        AverageAge<Student> averAge2 = new AverageAge<>(studList2);
        System.out.println("Студенты: " + averAge2.toString());

        AverageAge<Teacher> averAgeteach = new AverageAge<Teacher>(teachers);
        System.out.println("Преподаватели: " + averAgeteach.toString());
        
    }

    
}
