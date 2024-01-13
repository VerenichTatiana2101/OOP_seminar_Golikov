package services;

import java.util.ArrayList;
import java.util.List;

import comporators.PersonComparator;
import studentDomen.Teacher;

/**
 * TeacherService
 */
public class TeacherService implements iPersonService<Teacher> {
    private int count;
    private List<Teacher> teachersList;

    public TeacherService() {
        this.teachersList = new ArrayList<Teacher>();
    }

    // возвращает список студентов
    @Override
    public List<Teacher> getAll() {
        return teachersList;
    }

    // метод создания экземпляра студента
    @Override
    public void create(String firstName, String lastName, int age) {
        Teacher pers = new Teacher(count, firstName, lastName, age);
        /*
         * подставляем count чтобы при каждой регистрации студента
         * id автоматически увеличивалось на 1
         * нужно куда-то переменную сохранять при закрытии программы чтобы работало
         */
        count++;
        // после создания добавляем в общий список студентов б.данных
        teachersList.add(pers);
    }

    public void sortByAgeTeachersList() {
        // вызовем меторд сортироки и передадим наш ранее созданный компаратор
        teachersList.sort(new PersonComparator<Teacher>());
    }
}