package Supermarket.src.Interfaces;
import Supermarket.src.Classes.Actor;

public interface iActorBehaviuor {

    public boolean isTakeOrder() ;
    public boolean isMakeOrder() ;
    public void setTakeOrder(boolean takeOrder) ;
    public void setMakeOrder(boolean makeOrder) ;
    Actor getActor();
    
}
