package Supermarket.src.Classes;

public class PromoClient extends Actor {
    private String namePromo;
    private int idPromoClient;
    static int countPromo;

    public PromoClient(String name, String namePromo) {
        super(name);
        this.namePromo = namePromo;
    }

    @Override
    public Actor getActor() {
        return this; // return this возвращает ссылку на самого себя
    }

    public String getNamePromo() {
        return namePromo;
    }

    public void setNamePromo(String namePromo) {
        this.namePromo = namePromo;
    }

    public int getIdPromoClient() {
        return idPromoClient;
    }

    public void setIdPromoClient(int idPromoClient) {
        this.idPromoClient = idPromoClient;
    }

    public static int getCountPromo() {
        return countPromo;
    }

    public static void setCountPromo(int countPromo) {
        PromoClient.countPromo = countPromo;
    }

    @Override
    public String getName() {
        return super.name;
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

    /** переопределение метода: есть ли заявка от покупателя на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги покупатель */
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
