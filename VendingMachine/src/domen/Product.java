package VendingMachine.src.domen;

public class Product {
    // поля
    private String name;
    private long id;
    private int price;
    private int place;

    // public Product(String name, long id, int price, int place) {
    // this.name = name;
    // this.id = id;
    // // можно выполнить проверку прямо в конструкторе
    // // if price > 10{
    // this.price = price;
    // //} else {
    // //throw Exception или price = 10;
    // //}
    // this.place = place;
    // }

    public Product(String name, long id, int price, int place) {
        this.name = "Неизвестно";
        this.id = -1;
        this.price = -1;
        this.place = -1;
    }

    // конструкторы с разным количеством аргументов
    public Product(int price) {
        this.price = price;
    }

    public Product(int price, int place) {
        this(price);
        this.place = place;
    }

    public Product(String name, int price, int place) {
        this(price, place);
        this.name = name;
    }

    public Product(String name, int price, int place, long id) {
        this(name, price, place);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        // инкапсуляция, защита данных
        // вариант обработки
        // if (name.length() <= 1) throw Exception();
        // else
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

    @Override
    public String toString() {
        return "Product [name=" + name + ", id=" + id + ", price=" 
        + price + ", place=" + place + "]";
    }

}
