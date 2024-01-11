package controllers;

import studentDomen.User;

/*
 классы контроллеры, это те классып
 которые что-то контролируют, 
 выполняют функции по надзору на корректность введённых данных
 выполнения, переноса данных из одного места в другое
*/
public interface iPersonController<T extends User> {
    void create(String firstName, String lastName, int age);
}
