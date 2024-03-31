package Repos;

public class HojaCalculo {


    private static final int ROWS = 16;
    private static final int COLUMNS = 11;
    private static String[][] matrix = new String[ROWS][COLUMNS];


    public static void initializeMatrix() {

        for (int row = 1; row < ROWS; row++) {
            for (int col = 1; col < COLUMNS; col++) {
                matrix[row][col] = "";
            }
        }

        for (int row = 1; row < ROWS; row++) {
            matrix[row][0] = Integer.toString(row);
        }
        for (int col = 1; col < COLUMNS; col++) {
            matrix[0][col] = Character.toString((char) ('a' + col - 1));
        }
    }

    public static void showMatrix() {
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                if (col > 0) {
                    System.out.print("|");
                }
                if (matrix[row][col] != null) {
                    System.out.printf("%7s", matrix[row][col]);
                } else {
                    System.out.printf("%7s", "");
                }
            }
            System.out.println("|");
            if (row == 0 || row == ROWS - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        initializeMatrix();
        showMatrix();
    }


}
