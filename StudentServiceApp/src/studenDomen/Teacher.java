package studenDomen;

import java.util.UUID;

public class Teacher extends User {

    private UUID id;
    private String disciplines;

    public Teacher(String firstName, String lastName, int age, String disciplines) {
        super(firstName, lastName, age);
        this.disciplines = disciplines;
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
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
