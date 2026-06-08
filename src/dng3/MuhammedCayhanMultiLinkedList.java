/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dng3;

/**
 *
 * @author mcayh
 */
public class MuhammedCayhanMultiLinkedList {

    private MuhammedCayhanNode head;
    private final int ROWS = 7;
    private final int COLS = 5;

    public MuhammedCayhanMultiLinkedList() {
        // Multi-linked list'in ana başlangıç noktası 
        head = new MuhammedCayhanNode(0, -1, -1);
        
        // Sütun Başlıklarını Oluştur 
        MuhammedCayhanNode currCol = head;
        for (int c = 0; c < COLS; c++) {
            currCol.right = new MuhammedCayhanNode(0, -1, c);
            currCol = currCol.right;
        }

        // Satır Başlıklarını Oluştur 
        MuhammedCayhanNode currRow = head;
        for (int r = 0; r < ROWS; r++) {
            currRow.down = new MuhammedCayhanNode(0, r, -1);
            currRow = currRow.down;
        }
    }

    public void dropNumber(int value, int col) {
        if (col < 0 || col >= COLS) {
            System.out.println("Geçersiz sütun!");
            return;
        }

        MuhammedCayhanNode colHeader = getColumnHeader(col);
        
        // Eğer sütun tamamen boşsa, doğrudan en alta ekle
        if (colHeader.down == null) {
            insertNode(new MuhammedCayhanNode(value, ROWS - 1, col));
            return;
        }

        // Sütundaki en üst düğümü bul
        MuhammedCayhanNode topNode = colHeader.down;

        // BİRLEŞME (Merge) 
        if (topNode.value == value) {
            topNode.value *= 2; 
            cascadeMerge(topNode); // Aşağıya doğru zincirleme reaksiyonu kontrol et
        } 
        // YENİ EKLEME Durumu
        else {
            int newRow = topNode.row - 1;
            if (newRow < 0) {
                System.out.println("Oyun Bitti! Sütun " + col + " dolu.");
                return;
            }
            insertNode(new MuhammedCayhanNode(value, newRow, col));
        }
    }

    // Yerçekimine uygun zincirleme birleşme
    private void cascadeMerge(MuhammedCayhanNode topNode) {
        while (topNode.down != null && topNode.value == topNode.down.value) {
            MuhammedCayhanNode bottomNode = topNode.down;
            bottomNode.value *= 2; // Alt düğüm, üsttekinin değerini emer

            // Üstteki (topNode) düğümü sistemden koparıp siliyoruz
            MuhammedCayhanNode colHeader = getColumnHeader(topNode.col);
            colHeader.down = bottomNode; // Sütun bağlantısını bir alta bağla
            
            removeNodeFromRow(topNode); // Yatay satır bağlantısından sil
            
            topNode = bottomNode; // Zincirleme devamı için referansı aşağıya kaydır
        }
    }

    // Gerçek ortogonal listeye uygun araya ekleme (Insert)
    private void insertNode(MuhammedCayhanNode newNode) {
        // 1. Dikey Ekleme (Sütunun en üstüne)
        MuhammedCayhanNode colHeader = getColumnHeader(newNode.col);
        newNode.down = colHeader.down;
        colHeader.down = newNode;

        // 2. Yatay Ekleme (Satırda doğru sütun sırasına yerleştirme)
        MuhammedCayhanNode rowPrev = getRowHeader(newNode.row);
        while (rowPrev.right != null && rowPrev.right.col < newNode.col) {
            rowPrev = rowPrev.right;
        }
        newNode.right = rowPrev.right;
        rowPrev.right = newNode;
    }

    // Verilen düğümü satır (yatay) bağlantılarından siler
    private void removeNodeFromRow(MuhammedCayhanNode target) {
        MuhammedCayhanNode rowPrev = getRowHeader(target.row);
        while (rowPrev.right != null && rowPrev.right != target) {
            rowPrev = rowPrev.right;
        }
        if (rowPrev.right == target) {
            rowPrev.right = target.right;
        }
    }

    // Yardımcı: İstenen sütunun başlığını getirir
    private MuhammedCayhanNode getColumnHeader(int col) {
        MuhammedCayhanNode curr = head.right;
        while (curr != null) {
            if (curr.col == col) return curr;
            curr = curr.right;
        }
        return null;
    }

    // Yardımcı: İstenen satırın başlığını getirir
    private MuhammedCayhanNode getRowHeader(int row) {
        MuhammedCayhanNode curr = head.down;
        while (curr != null) {
            if (curr.row == row) return curr;
            curr = curr.down;
        }
        return null;
    }

    // ekrana yazdırma metodu
    public void printGrid() {
        System.out.println("-----------------------------------");
        MuhammedCayhanNode currRow = head.down; // İlk satır başlığı 
        
        while (currRow != null) {
            MuhammedCayhanNode currNode = currRow.right; // O satırdaki ilk dolu düğüm
            
            // 0'dan 4'e kadar yatay tarama
            for (int c = 0; c < COLS; c++) {
                if (currNode != null && currNode.col == c) {
                    System.out.printf("[%4d] ", currNode.value);
                    currNode = currNode.right; // Yazdırdıktan sonra sağdaki dolu düğüme geç
                } else {
                    System.out.print("[    ] "); // O koordinatta düğüm yoksa boş bas
                }
            }
            System.out.println();
            currRow = currRow.down; // Bir alt satıra geç
        }
        System.out.println("-----------------------------------");
    }

}
