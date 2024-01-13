package controllers;

import services.TeacherService;
import studentDomen.Teacher;

public class TeacherController implements iPersonController<Teacher>{
    private final TeacherService dataService = new TeacherService();

    // метод регистрации студента в базе данных
    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
        // добавив человека в б.д. сразу отсортировав список
        dataService.sortByAgeTeachersList();
    }


}
