package studentDomen;

public class Teacher extends User {

    private int id;
    private String disciplines;

    public Teacher(int id, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.id = id;
    }

    public Teacher(int id, String firstName, String lastName, int age, String disciplines) {
        super(firstName, lastName, age);
        this.disciplines = disciplines;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getdisciplines() {
        return disciplines;
    }

    public void setdisciplines(String disciplines) {
        this.disciplines = disciplines;
    }

    @Override
    public String toString() {
        return "Teacher {Id=" + id
                + ",\n FirstName='" + super.getFirstName()
                + "', LastName='" + super.getLastName()
                + "', Age=" + super.getAge()
                + ", Disciplines='" + disciplines + "'}\n";
    }

}
