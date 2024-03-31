package Repos;

import java.util.Scanner;

public class HojaCalculo {

    private static final int ROWS = 16;
    private static final int COLUMNS = 11;
    private static String[][] matrix = new String[ROWS][COLUMNS];
    private static int currentRow = 1;
    private static int currentCol = 1;

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

    public static void interactWithUser() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "By default, you are at 'a1'. Enter 'w', 'a', 's', 'd' to navigate, 'e' to edit, or 'q' to exit:");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("q")) {
                break;
            }

            System.out.println("Ahora estás en la celda " + matrix[0][currentCol] + currentRow);
            showMatrix();
        }

        scanner.close();
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
