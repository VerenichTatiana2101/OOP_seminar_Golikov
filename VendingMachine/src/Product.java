public class Product {
    private String name;
    private long id;
    private int price;
    private int place;
    
    public Product(String name, long id, int price, int place) {
        this.name = name;
        this.id = id;
        this.price = price;
        this.place = place;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPlace() {
        return place;
    }

    public void setPlace(int place) {
        this.place = place;
    }

    
}
