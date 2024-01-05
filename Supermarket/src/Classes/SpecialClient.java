package Supermarket.src.Classes;

public class SpecialClient extends Actor{

    private int idVip;

    public SpecialClient(String name, int id) {
        super(name);
        this.idVip = id;
    }

    public int getIdVip() {
        return idVip;
    }

    @Override
    public String getName() {
        return super.name;
    }

    @Override
    public Actor getActor() {
        return this;  //return this возвращает ссылку на самого себя
    }

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

    
}
