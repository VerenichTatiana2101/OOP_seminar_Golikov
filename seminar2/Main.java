package seminar2;

public class Main {
    public static void main(String[] args) {

        CherryTigo cherry = new CherryTigo();
        IStartEngine myCar = new GasEngine();
        cherry.StartEngine(myCar);

    }

}
