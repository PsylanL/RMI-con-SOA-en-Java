/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Client;

import Interface.SudokuService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class SudokuClient {
    private SudokuClient() {}

    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(null); // Usar 'null' para 'localhost'
            SudokuService service = (SudokuService) registry.lookup("SudokuService");

            Scanner scanner = new Scanner(System.in);
            int opcion;
            do {
                System.out.println("GENERADOR SUDOKU\n1. Matriz 4x4\n2. Matriz 9x9\n3. Matriz 16x16\n4. Salir");
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        mostrarMatriz(service.generarSudoku4x4());
                        break;
                    case 2:
                        mostrarMatriz(service.generarSudoku9x9());
                        break;
                    case 3:
                        mostrarMatriz(service.generarSudoku16x16());
                        break;
                }
            } while (opcion != 4);

        } catch (Exception e) {
            System.err.println("Error del cliente: " + e.toString());
            e.printStackTrace();
        }
    }

    private static void mostrarMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int celda : fila) {
                System.out.print(celda + " ");
            }
            System.out.println();
        }
    }
}

