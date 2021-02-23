package hw2;

public class Main {
    static int SIZE = 4;
    public static void main(String[] args) {
        String [][]arr = {
                {"3", "5", "6", "2"},
                {"9tr", "1", "8", "4"},
                {"6", "8", "2", "5"},
                {"0", "4", "7", "9"}
        };
        try {
            System.out.println(sum(arr));
        }catch (MyArraySizeException e){
            e.printStackTrace();
        }catch (MyArrayDataException e){
            e.printStackTrace();
            System.out.println(e.getRow() + " " + e.getColumn());
            System.out.println(arr[e.getRow()][e.getColumn()]);
        }
        System.out.println("The end");
    }
    static int sum(String[][]arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != SIZE) {
            throw new MyArraySizeException();
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != SIZE) {
                throw new MyArraySizeException();
            }
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("format " + i + " " + j, i, j);
                }
            }
        }
        return sum;
    }
}
