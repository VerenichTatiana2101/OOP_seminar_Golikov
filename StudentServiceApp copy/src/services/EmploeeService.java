package services;

import java.util.ArrayList;
import java.util.List;

import studentDomen.Emploee;
import studentDomen.PersonComparator;

public class EmploeeService implements iPersonService<Emploee> {
    private int count;
    private List<Emploee> emploeeList;

    public EmploeeService() {
        this.emploeeList = new ArrayList<Emploee>();
    }

    @Override
    public List<Emploee> getAll() {
        return emploeeList;
    }

    // метод создания экземпляра студента
    @Override
    public void create(String firstName, String lastName, int age) {
        Emploee pers = new Emploee(count, firstName, lastName, age);
        // подставляем count чтобы при каждой регистрации студента
        // id автоматически увеличивалось на 1
        count++;
        // после создания добавляем в общий список студентов б.данных
        emploeeList.add(pers);
    }

    public void sortByAgeStudList() {
        // вызовем меторд сортироки и передадим наш ранее созданный компаратор
        emploeeList.sort(new PersonComparator<Emploee>());
    }
}
