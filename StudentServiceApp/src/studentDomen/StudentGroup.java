package studentDomen;

import java.util.Iterator;
import java.util.List;

//подключаем итерируемость для возможности перебора студентов в группе студентов
public class StudentGroup implements Iterable<Student> {
    private List<Student> students;

    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // для работы итератора переопределяем метод
    // но сначала создаём класс StudentGroupIterator
    @Override
    public Iterator<Student> iterator() {
        return new StudentGroupIterator(students);
    }

    // или анонимный метод
    // @Override
    // public Iterator<Student> iterator() {
    // return new Iterator<Student>() {
    // private int index = 0;
    // @Override
    // public boolean hasNext() {
    // return index < students.size();
    // }

    // @Override
    // public Student next() {
    // if (!hasNext()) {
    // return null;
    // }
    // return students.get(index++);
    // }
    // };
    // }

}
