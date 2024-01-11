package studentDomen;

// класс, работники университета
public class Emploee extends User {
    private int id;
    private String special;

    public Emploee(int id, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.id = id;
    }

    public Emploee(int id, String firstName, String lastName, int age, String special) {
        super(firstName, lastName, age);
        this.special = special;
        this.id = id;
    }

    public String getSpecial() {
        return special;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
