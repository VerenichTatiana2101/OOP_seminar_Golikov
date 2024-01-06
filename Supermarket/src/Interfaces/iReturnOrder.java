package Supermarket.src.Interfaces;

public interface iReturnOrder {
    /** клиент сделал заявку на возврат */
    void setMakeReturnOrder(boolean makeReturnOrder);

    /** клиент забрал деньги */
    void setTakeCash(boolean takeCash);

    /** сделал ли клиент заявку на возврат */
    boolean isMakeReturnOrder();

    /** забрал ли клиент деньги */
    boolean isTakeCash();

}
