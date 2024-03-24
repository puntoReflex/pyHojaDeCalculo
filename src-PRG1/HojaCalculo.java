package Repos;

import java.util.Scanner;

public class HojaCalculo {


    private static final int NUM_FILAS = 16;
    private static final int NUM_COLUMNAS = 11;
    private static String[][] matriz = new String[NUM_FILAS][NUM_COLUMNAS];
    private static int filaAct = 1;
    private static int colAct = 1;


    public static void inicializarMatriz() {
        
        for (int i = 1; i < NUM_FILAS; i++) {
            for (int j = 1; j < NUM_COLUMNAS; j++) {
                matriz[i][j] = "";
            }
        }

        for (int i = 1; i < NUM_FILAS; i++) {
            matriz[i][0] = Integer.toString(i);
        }
        for (int j = 1; j < NUM_COLUMNAS; j++) {
            matriz[0][j] = Character.toString((char) ('a' + j - 1));
        }
    }

    public static void interactuarConUsuario() {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Por defecto se encuentra en 'a1'. Ingrese 'w', 'a', 's', 'd' para navegar, 'e' para editar, o 'q' para salir:");
            String entrada = scanner.nextLine();
            if (entrada.equalsIgnoreCase("q")) {
                break;
            }
            
            System.out.println("Ahora estás en la celda " + matriz[0][colAct] + filaAct);
            mostrarMatriz();
        }

        scanner.close();
    }

    public static void mostrarMatriz() {
        for (int i = 0; i < NUM_FILAS; i++) {
            for (int j = 0; j < NUM_COLUMNAS; j++) {
                if (j > 0) {
                    System.out.print("|");
                }
                if (matriz[i][j] != null) {
                    System.out.printf("%7s", matriz[i][j]);
                } else {
                    System.out.printf("%7s", "");
                }
            }
            System.out.println("|");
            if (i == 0 || i == NUM_FILAS - 1) {
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        inicializarMatriz();
        interactuarConUsuario();
        mostrarMatriz();
    }

    
}
