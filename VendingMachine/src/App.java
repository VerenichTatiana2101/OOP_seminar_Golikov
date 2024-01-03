import services.CoinDispencer;
import services.Display;
import services.Holder;
import services.VendingMachine;
import java.util.List;
import java.util.ArrayList;

import domen.Bottle;
import domen.HotDrink;
import domen.Product;

public class App {
    public static void main(String[] args) {

        // наполняем автомат списком продуктов
        List<Product> assort = new ArrayList<>();
        Product item1 = new Product("Lays", 100, 1);
        Product item2 = new Product("Cola", 50, 2);
        //варианты создания наследника продукта
        //полиморфизм, присваиваем потомка родителю
        Product item3 = new Bottle("Pepsi", 40, 3, 1, 0.300);
        Bottle item4 = new Bottle("Sprite", 60, 5, 3, 0.600);
        HotDrink item5 = new HotDrink("Coffee", 150, 4, 2, 80);
        assort.add(item1);
        assort.add(item2);
        assort.add(item3);
        assort.add(item4);
        assort.add(item5);

        // создаём холдер
        Holder hold1 = new Holder(4, 4);

        // создаём диспенсер
        CoinDispencer dispencer1 = new CoinDispencer(0);

        // дисплей
        Display disp = new Display();

        // центральная фигура это vendingMachine
        // создаем экземпляр этого класса
        // видим что еще нет ни холдера ни ассортимента,
        // выше добавляем
        VendingMachine vMachine = new VendingMachine(hold1, dispencer1, assort, disp);

        // посмотреть, что есть внутри нашей машины
        for (Product prod : vMachine.getProducts()) {
            System.out.println(prod);
        }

        

    }
}
