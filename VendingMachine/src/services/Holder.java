package VendingMachine.src.services;
import VendingMachine.src.domen.Places;

import java.util.List;
import java.util.ArrayList;


public class Holder {
    private List<Places> places;

    public Holder(int xSize, int ySize) {
        // новый массив спиралек автомата
        places = new ArrayList<>(xSize * ySize);
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                // проходит все ячейки и кладёт туда новый
                // экземпляр класса (объект класса)
                places.add(new Places(x, y));
            }
        }
    }

    public boolean release(int x, int y){
        return places.stream().filter(place -> place.getColumn() == x && place.getRow() == y)
        .findFirst().get().setEmpty(true);
    }

    public int getBalance() {
        return 0;
    }
}
