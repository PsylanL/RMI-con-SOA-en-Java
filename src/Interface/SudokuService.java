package Interface;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface SudokuService extends Remote {
    int[][] generarSudoku4x4() throws RemoteException;
    int[][] generarSudoku9x9() throws RemoteException;
    int[][] generarSudoku16x16() throws RemoteException;
}