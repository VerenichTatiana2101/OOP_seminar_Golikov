package Supermarket.src.Classes;

import Supermarket.src.Interfaces.iActorBehaviuor;
import Supermarket.src.Interfaces.iReturnOrder;

public abstract class Actor implements iActorBehaviuor, iReturnOrder {

    // protected поля для того чтобы мы
    // могли к ним подключиться напрямую из наследуемых
    // абстрактый класс классов
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;
    /** статус оплаты */
    protected boolean isTakeCash;
    /** статус возврата заказа */
    protected boolean isMakeReturnOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

    // тут они нам не нужны, т.к мы используем интерфейс с этими методами
    // public boolean isTakeOrder() {
    // return isTakeOrder;
    // }

    // public boolean isMakeOrder() {
    // return isMakeOrder;
    // }

    // public void setTakeOrder(boolean takeOrder) {
    // isTakeOrder = takeOrder;
    // }

    // public void setMakeOrder(boolean makeOrder) {
    // isMakeOrder = makeOrder;
    // }
}
