package Supermarket.src.Classes;

import Supermarket.src.Interfaces.iActorBehaviuor;

public abstract class Actor implements iActorBehaviuor {

    // protected поля для того чтобы мы
    // могли к ним подключиться напрямую из наследуемых
    // абстрактый класс классов
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    public Actor(String name) {
        this.name = name;
    }

    abstract public String getName();

    //тут они нам не нужны, т.к мы используем интерфейс с этими методами
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
