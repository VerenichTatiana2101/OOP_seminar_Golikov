package studentDomen;

import java.util.UUID;

public class Student extends User {
    private UUID id;

    public Student(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.id = UUID.randomUUID();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student {Id=" + getId()
                + ",\n FirstName='" + super.getFirstName()
                + "', LastName='" + super.getLastName()
                + "', Age=" + super.getAge() + "}\n";
    }

}
