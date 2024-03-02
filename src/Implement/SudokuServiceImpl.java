package Implement;

import Interface.SudokuService;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

public class SudokuServiceImpl extends UnicastRemoteObject implements SudokuService {

    public SudokuServiceImpl() throws RemoteException {
        super();
    }

    @Override
    public int[][] generarSudoku4x4() throws RemoteException {
        // Implementación para generar una matriz de Sudoku 4x4
        return new int[4][4]; // Retorna una matriz de ejemplo
    }

    @Override
    public int[][] generarSudoku9x9() throws RemoteException {
        // Implementación para generar una matriz de Sudoku 9x9
        return new int[9][9]; // Retorna una matriz de ejemplo
    }

    @Override
    public int[][] generarSudoku16x16() throws RemoteException {
        // Implementación para generar una matriz de Sudoku 16x16
        return new int[16][16]; // Retorna una matriz de ejemplo
    }
}