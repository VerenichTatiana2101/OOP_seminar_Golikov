package Supermarket.src;

import Supermarket.src.Classes.Market;
import Supermarket.src.Classes.OrdinaryClient;
import Supermarket.src.Classes.PensionerClient;
import Supermarket.src.Classes.PromoClient;
import Supermarket.src.Classes.SpecialClient;
import Supermarket.src.Classes.TaxService;
import Supermarket.src.Interfaces.iActorBehaviuor;

public class App {
    public static void main(String[] args) throws Exception {

        Market magnit = new Market();
        // создать Actor мы не можем тк он абстрактый
        iActorBehaviuor client1 = new OrdinaryClient("Tatsiana");
        iActorBehaviuor client2 = new SpecialClient("Oleg", 1);
        iActorBehaviuor p = new PensionerClient("Toma", 1);
        iActorBehaviuor tax = new TaxService();
        iActorBehaviuor client3 = new PromoClient("Tosha", "promo");
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(client3);
        magnit.update(); // запускает логику работы магазина
    }
}
