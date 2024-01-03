package domen;

public class Bottle extends Product {
    private double weight;

    // пример наследования конструктора
    public Bottle(String name, int price, int place, long id, double weight) {
        super(name, price, place, id);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // переопределение метода toString у наследника класса
    // @Override
    // public String toString() {
    // return super.toString() + " Beverage weight=" + getWeight();
    // }
    // или

    // @Override
    // public String toString() {
    // return "Product (" + this.getClass() + "): [name=" + super.getName() + ",
    // id=" + super.getId()
    // + ", price=" + super.getPrice() + ", place=" + super.getPlace() + ", weight="
    // + weight + "]";
    // }
    // или

    @Override
    public String toString() {
        return "Product Beverage: [name=" + super.getName()
                + ", id=" + super.getId()
                + ", price=" + super.getPrice()
                + ", place=" + super.getPlace()
                + ", weight=" + weight + "]";
    }

    // или так
    // @Override
    // public String toString() {
    // return "Beverage " + super.toString() + " weight=" + getWeight();
    // }

}
