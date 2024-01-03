package services;

public class CoinDispencer {
    private int nominal;

    public CoinDispencer(int nominal) {
        this.nominal = nominal;
    }

    @Override
    public String toString() {
        return "CoinDispencer [nominal=" + nominal + "]";
    }

    public int getSumm(int insertCoin, int outCoin) {
        int sumCoin;
        sumCoin = insertCoin + outCoin;
        return sumCoin;
    }

    public int giveChange(int summCoin, int price) {
        int change;
        if (price < summCoin) {
            change = summCoin - price;
        } else if (price == summCoin) {
            change = summCoin - price;
        } else
            change = 0;
        return change;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public boolean dispence(int price) {
        return false;
    }

}
