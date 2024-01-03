import services.CoinDispencer;
import services.Display;
import services.Holder;
import services.VendingMachine;
import java.util.List;
import java.util.ArrayList;

import domen.Product;

public class App {
    public static void main(String[] args) throws Exception {

        // наполняем автомат списком продуктов
        List<Product> assort = new ArrayList<>();
        Product item1 = new Product("Lays", 100, 1);
        Product item2 = new Product("Cola", 50, 2);
        assort.add(item1);
        assort.add(item2);

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
