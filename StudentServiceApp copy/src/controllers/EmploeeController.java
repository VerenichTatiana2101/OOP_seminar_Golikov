package controllers;

import services.EmploeeService;
import studentDomen.Emploee;
// import studentDomen.User;

public class EmploeeController implements iPersonController<Emploee> {
    private final EmploeeService dataService = new EmploeeService();

    // метод регистрации студента в базе данных
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
        // добавив человека в б.д. сразу отсортировав список
        dataService.sortByAgeStudList();
    }

    /*
     * // метод дженерик выплаты зп работику
     * public <T extends User> void paySalary(T person) {
     * System.out.println(person.getFirstName() + " "
     * + person.getLastName() + " Выплачена зарплата 10000");
     * }
     */

    /*
     * метод дженерик выплаты зп работику
     * для того чтобы другой класс не мог использовать данный метод
     * для защиты меняем наследование на
     */
    public static <T extends Emploee> void paySalary(T person) {
        System.out.println(person.getFirstName() + " "
                + person.getLastName() + " Выплачена зарплата 10000");
    }

    /*
     * У дженериков есть подводные камни:
     * внутри метода нельзя использовать new  ...()
     */
}
