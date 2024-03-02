/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Server;

import Implement.SudokuServiceImpl;
import Interface.SudokuService;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class SudokuServer {
    public static void main(String[] args) {
        try {
            SudokuService service = new SudokuServiceImpl();
            Registry registry = LocateRegistry.createRegistry(1099); // Puerto por defecto de RMI
            registry.bind("SudokuService", service);
            System.out.println("Servicio de Sudoku iniciado.");
        } catch (Exception e) {
            System.err.println("Error del servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}