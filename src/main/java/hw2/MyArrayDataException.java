package hw2;

public class MyArrayDataException {
    private int row;
    private int column;

    public int getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }
    public MyArrayDataException(String message, int row, int column){
        super(message);
        this.row=row;
        this.column=column;
    }
}
