package Supermarket.src.Classes;

public class OrdinaryClient extends Actor {

    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this; //return this возвращает ссылку на самого себя
    }

    // через super мы подключаемся к полям родительского класса
    // super писать не обязательно, 
    // но наглядно так понятнее и правильно
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    @Override
    public void setTakeOrder(boolean makeOder) {
        super.isMakeOrder = makeOder;
    }

    @Override
    public void setMakeOrder(boolean pikUpOrder) {
        super.isTakeOrder = pikUpOrder;
    }

    /** переопределение метода: есть ли заявка от покупателя на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги покупатель*/
    @Override
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода: покупатель сделал заявку на возврат */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода: покупатель забрад деньги */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }





}
