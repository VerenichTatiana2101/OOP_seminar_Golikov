package studentDomen;

public class Student extends User implements Comparable<Student> {
    private int id;

    public Student(int id, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student {Id=" + getId()
                + ",\n FirstName='" + super.getFirstName()
                + "', LastName='" + super.getLastName()
                + "', Age=" + super.getAge() + "}\n";
    }

    /// сортировка по возрасту
    // super т.к у родителя поле,
    // если в классе то this
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            return 0;
        }
        if (super.getAge() > o.getAge()) {
            return 1;
        }
        return -1;
    }

    // // сортировка сначала по возрасту потом по id
    // @Override
    // public int compareTo(Student o) {
    // if (super.getAge() == o.getAge()) {
    // if (this.id == o.id) {
    // return 0;
    // }
    // if (this.id < o.id) {
    // return -1;
    // }
    // return 1;
    // }
    // if (super.getAge() > o.getAge()) {
    // return 1;
    // }
    // return -1;
    // }

}
