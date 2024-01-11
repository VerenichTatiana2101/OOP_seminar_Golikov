package controllers;

import services.StudentService;
import studentDomen.Student;

/*
 классы контроллеры, это те классып
 которые что-то контролируют, 
 выполняют функции по надзору на корректность введённых данных
 выполнения, переноса данных из одного места в другое
 как хозяин всех сервисов, тот кто вызывает первично, главный
*/

// контроллер будет работать с сервисом, создаем класс студент сервс
public class StudentController implements iPersonController<Student>{
    private final StudentService dataService = new StudentService();

    // метод регистрации студента в базе данных
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
        // добавив человека в б.д. сразу отсортировав список
        dataService.sortByAgeStudList();
    }


}
