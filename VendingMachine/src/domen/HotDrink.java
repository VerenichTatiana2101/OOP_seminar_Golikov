package VendingMachine.src.domen;

public class HotDrink extends Product {
    private int temperature;

    public HotDrink(String name, int price, int place, long id, int temperature) {
        super(name, price, place, id);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "Product Hot Drink: [name=" + super.getName()
                + ", id=" + super.getId()
                + ", price=" + super.getPrice()
                + ", place=" + super.getPlace()
                + ", temperature=" + temperature + "°C]";
    }
    
}
