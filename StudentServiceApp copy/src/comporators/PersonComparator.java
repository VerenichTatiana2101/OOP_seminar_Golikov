package comporators;

import java.util.Comparator;

import studentDomen.User;

/**
 * PersonComparator
 * класс для сравнивания
 * сравнение по фамилии в формате дженерика
 */
public class PersonComparator<T extends User> implements Comparator<T> {

    // сравнение по возрасту
    @Override
    public int compare(T o1, T o2) {
        // int res = o1.getFirstName().compareTo(o2.getFirstName());
        // if (res == 0) {
        if (o1.getAge() == o2.getAge()) {
            return 0;
        } else {
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        }
        // } else {
        // return res;
        // }
    }

}