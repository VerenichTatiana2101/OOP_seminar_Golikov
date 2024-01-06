package Supermarket.src.Classes;

public class PensionerClient extends Actor {
    private int pensID;

    public PensionerClient(String name, int pensID) {
        super(name+" - (пенсионер)");
        this.pensID = pensID;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Actor getActor() {
      return this; //return this возвращает ссылку на самого себя
    }

    public int getPensID() {
      return pensID;
    }

    public void setPensID(int pensID) {
      this.pensID = pensID;
    }

    public boolean isTakeOrder() {
      return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
      return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOder) {
      super.isMakeOrder = makeOder;
    }
    
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
