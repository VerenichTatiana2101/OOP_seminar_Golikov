package services;

import java.util.ArrayList;
import java.util.List;

import comporators.PersonComparator;
import studentDomen.Student;

/*
 * сервисы это всё, что связано с какими-то действиями
 * регистрации, удаление, выписки
 * Методы сортировки логично добавлять в сервисы,
 * т.к. это место, где у нас все инструменты
 */

// базовый класс, который будет содержать всех студентов
public class StudentService implements iPersonService<Student> {
    private int count;
    private List<Student> studList;

    public StudentService() {
        this.studList = new ArrayList<Student>();
    }

    // возвращает список студентов
    @Override
    public List<Student> getAll() {
        return studList;
    }

    // метод создания экземпляра студента
    @Override
    public void create(String firstName, String lastName, int age) {
        Student pers = new Student(count, firstName, lastName, age);
        /*
         * подставляем count чтобы при каждой регистрации студента
         * id автоматически увеличивалось на 1
         * нужно куда-то переменную сохранять при закрытии программы чтобы работало
         */
        count++;
        // после создания добавляем в общий список студентов б.данных
        studList.add(pers);
    }

    public void sortByAgeStudList() {
        // вызовем меторд сортироки и передадим наш ранее созданный компаратор
        studList.sort(new PersonComparator<Student>());
    }

    /*
     * public List<Student> getSortByAgeStudList(){
     * // создаём копию на основании листа
     * List<Student> newStudList = new ArrayList<>(studList);
     * // вызовем меторд сортироки и передадим наш ранее созданный компаратор
     * newStudList.sort(new PersonComparator<Student>());
     * return newStudList;
     * }
     */

     /*
      * можно добавить метод на проверку уникальности 
      * используя компоратор
      */
}
