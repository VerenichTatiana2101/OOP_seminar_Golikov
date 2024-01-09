package studentDomen;

import java.util.Iterator;
import java.util.List;

//подключаем итерируемость для возможности перебора студентов в группе студентов
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private int stGropNum;
    private List<Student> students;

    public StudentGroup(int stGropNum, List<Student> students) {
        this.stGropNum = stGropNum;
        this.students = students;
    }

    public int getStGropNum() {
        return stGropNum;
    }

    public void setStGropNum(int stGropNum) {
        this.stGropNum = stGropNum;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int countStudents(List<Student> students) {
        return students.size();
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

    @Override
    public String toString() {
        return "StudentGroup - " + stGropNum
                + ", students count: "
                + countStudents(students) + "\n"
                + students
                + ".\n";
    }

    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.getStudents().size()) {
            if (this.stGropNum == o.stGropNum) {
                return 0;
            }
            if (this.stGropNum < o.stGropNum) {
                return -1;
            }
            return 1;
        }
        if (this.students.size() < o.getStudents().size()) {
            return -1;
        }
        return 1;
    }

}
