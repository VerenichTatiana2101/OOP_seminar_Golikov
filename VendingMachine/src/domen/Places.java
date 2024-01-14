package VendingMachine.src.domen;

public class Places {
    private int row;
    private int column;
    private boolean empty;

    public Places(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean setEmpty(boolean empty) {
        boolean result = this.empty;
        this.empty = empty;
        return result;
    }
}
