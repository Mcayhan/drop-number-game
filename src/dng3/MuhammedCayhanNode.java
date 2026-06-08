/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dng3;

/**
 *
 * @author mcayh
 */
public class MuhammedCayhanNode {

    public int value;
    public int row;
    public int col;

    public MuhammedCayhanNode right; // Aynı satırdaki bir sonraki düğüm (sağdaki)
    public MuhammedCayhanNode down;  // Aynı sütundaki bir sonraki düğüm (aşağıdaki)

    public MuhammedCayhanNode(int value, int row, int col) {
        this.value = value;
        this.row = row;
        this.col = col;
        this.right = null;
        this.down = null;
    }
}
