package studentDomen;

import java.util.Iterator;
import java.util.List;

//итератор это тот, кто постоянно возвращает какое-то значение 
// либо нет необходимости
// должен унаследоваться от итератора
public class StudentGroupIterator implements Iterator<Student> {

    // внутри должен быть счётчик
    private int counter;
    // List будет final т.к будет создаваться один раз
    private final List<Student> students;

    public StudentGroupIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    @Override
    public boolean hasNext() {
        return counter < students.size();
    }

    @Override
    public Student next() {
        if (!hasNext()) {
            return null;
        }
        // counter ++;
        return students.get(counter++);
    }

}
