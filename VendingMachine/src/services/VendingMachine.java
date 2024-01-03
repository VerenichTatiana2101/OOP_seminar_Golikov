package services;
import java.util.List;

import domen.Product;

public class VendingMachine {
    private Holder holder;
    private CoinDispencer dispencer;
    private List<Product> assort;
    private Display display;

    public VendingMachine(Holder holder, CoinDispencer dispencer, List<Product> assort, Display display) {
        this.holder = holder;
        this.dispencer = dispencer;
        this.assort = assort;
        this.display = display;
    }

    public void buyProduct(Product p, int price){
        if(assort.contains(p) && holder.getBalance() >= price){
            if(dispencer.dispence(price)){
                releaseProduct(p, holder);
                display.print("You have successfully bought " + p.getName() + ".");
            }
        } else {
            display.print("Product not available or insufficient balance.");
        }
    }

    public void releaseProduct(Product p, Holder h) {
        h.release(0, 0);
        assort.remove(p);
    }

    public void cancel() {
        dispencer.giveChange(0, 0);
    }

    public List<Product> getProducts(){
        return assort;
    }


}
