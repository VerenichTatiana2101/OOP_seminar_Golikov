package VendingMachine.src;

import VendingMachine.src.services.VendingMachine;
import VendingMachine.src.domen.Bottle;
import VendingMachine.src.domen.HotDrink;
import VendingMachine.src.domen.Product;
import VendingMachine.src.services.CoinDispencer;
import VendingMachine.src.services.Display;
import VendingMachine.src.services.Holder;

import java.util.ArrayList;
import java.util.List;

public class Programm {
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
        CoinDispencer dspFirst = new CoinDispencer(0);

        // дисплей
        Display dsp = new Display();

        // центральная фигура это vendingMachine
        // создаем экземпляр этого класса
        // видим что еще нет ни холдера ни ассортимента,
        // выше добавляем
        VendingMachine vMachine = new VendingMachine(hold1, dspFirst, assort, dsp);

        // посмотреть, что есть внутри нашей машины
        for (Product prod : vMachine.getProducts()) {
            System.out.println(prod);
        }

        

    }
}
