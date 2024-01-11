package controllers;

import services.EmploeeService;
import studentDomen.Emploee;
import studentDomen.User;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService dataService = new EmploeeService();

    // метод регистрации студента в базе данных
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
        // добавив человека в б.д. сразу отсортировав список
        dataService.sortByAgeStudList();
    }

    // метод дженерик выплаты зп работику
    public <T extends User> void paySalary(T person) {
        System.out.println(person.getFirstName() + " "
                + person.getLastName() + " Выплачена зарплата 10000");
    }
}
