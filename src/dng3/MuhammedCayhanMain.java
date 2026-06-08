/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dng3;

/**
 *
 * @author mcayh
 */
public class MuhammedCayhanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MuhammedCayhanMultiLinkedList game = new MuhammedCayhanMultiLinkedList();

        System.out.println("Initial situation : Empty Grid");
        game.printGrid();
        
        System.out.println("Step: 1 | Value: 2 | Column: 0");
        game.dropNumber(2, 0);
        game.printGrid();

        System.out.println("Step: 2 | Value: 2 | Column: 3");
        game.dropNumber(2, 3);
        game.printGrid();

        System.out.println("Step: 3 | Value: 4 | Column: 1");
        game.dropNumber(4, 1);
        game.printGrid();

        System.out.println("Step: 4 | Value: 2 | Column: 2");
        game.dropNumber(2, 2);
        game.printGrid();

        System.out.println("Step: 5 | Value: 4 | Column: 4");
        game.dropNumber(4, 4);
        game.printGrid();

        System.out.println("Step: 6 | Value: 2 | Column: 1");
        game.dropNumber(2, 1);
        game.printGrid();

        System.out.println("Step: 7 | Value: 4 | Column: 4");
        game.dropNumber(4, 4);
        game.printGrid();

        System.out.println("Step: 8 | Value: 8 | Column: 0");
        game.dropNumber(8, 0);
        game.printGrid();

        System.out.println("Step: 9 | Value: 8 | Column: 0");
        game.dropNumber(8, 0);
        game.printGrid();

        System.out.println("Step: 10 | Value: 32 | Column: 1");
        game.dropNumber(32, 1);
        game.printGrid();

        System.out.println("Step: 11 | Value: 2 | Column: 2");
        game.dropNumber(2, 2);
        game.printGrid();

        System.out.println("Step: 12 | Value: 64 | Column: 2");
        game.dropNumber(64, 2);
        game.printGrid();

        System.out.println("Step: 13 | Value: 16 | Column: 3");
        game.dropNumber(16, 3);
        game.printGrid();

        System.out.println("Step: 14 | Value: 64 | Column: 1");
        game.dropNumber(64, 1);
        game.printGrid();

        System.out.println("Step: 15 | Value: 32 | Column: 2");
        game.dropNumber(32, 2);
        game.printGrid();

        System.out.println("Step: 16 | Value: 16 | Column: 0");
        game.dropNumber(16, 0);
        game.printGrid();

        System.out.println("Step: 17 | Value: 16 | Column: 4");
        game.dropNumber(16, 4);
        game.printGrid();

        System.out.println("Step: 18 | Value: 32 | Column: 2");
        game.dropNumber(32, 2);
        game.printGrid();

        System.out.println("Step: 19 | Value: 64 | Column: 1");
        game.dropNumber(64, 1);
        game.printGrid();

        System.out.println("Step: 20 | Value: 8 | Column: 3");
        game.dropNumber(8, 3);
        game.printGrid();

        System.out.println("Step: 21 | Value: 4 | Column: 3");
        game.dropNumber(4, 3);
        game.printGrid();

        System.out.println("Step: 22 | Value: 2 | Column: 3");
        game.dropNumber(2, 3);
        game.printGrid();

        System.out.println("Step: 23 | Value: 2 | Column: 3");
        game.dropNumber(2, 3);
        game.printGrid();

        System.out.println("Step: 24 | Value: 2 | Column: 1");
        game.dropNumber(2, 1);
        game.printGrid();

        System.out.println("Step: 25 | Value: 64 | Column: 2");
        game.dropNumber(64, 2);
        game.printGrid();

        System.out.println("Step: 26 | Value: 32 | Column: 2");
        game.dropNumber(32, 2);
        game.printGrid();

        System.out.println("Step: 27 | Value: 16 | Column: 2");
        game.dropNumber(16, 2);
        game.printGrid();

        System.out.println("Step: 28 | Value: 8 | Column: 2");
        game.dropNumber(8, 2);
        game.printGrid();

        System.out.println("Step: 29 | Value: 8 | Column: 2");
        game.dropNumber(8, 2);
        game.printGrid();

        System.out.println("Step: 30 | Value: 4 | Column: 1");
        game.dropNumber(4, 1);
        game.printGrid();

        System.out.println("Step: 31 | Value: 8 | Column: 1");
        game.dropNumber(8, 1);
        game.printGrid();
        

    }

}
