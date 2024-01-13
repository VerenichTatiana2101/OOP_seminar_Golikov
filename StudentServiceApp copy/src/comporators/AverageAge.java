package comporators;

import java.util.List;

import studentDomen.User;

public class AverageAge<T extends User> {
    private List<T> users;

    public AverageAge(List<T> users) {
        this.users = users;
    }

    /* считаем средний возраст */
    public double averAge() {
        double sum = 0;
        for (T index : users) {
            sum = sum + index.getAge();
        }
        return sum / users.size();
    }

    @Override
    public String toString() {
        return "Средний возраст = " + averAge();
    }


}
