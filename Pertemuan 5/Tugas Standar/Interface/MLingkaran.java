/*
 * MLingkaran.java 19/03/2024
 * Penulis: Ghirsan Ahdani
 * Deskripsi: Implementasi cara menghitung luas lingkaran.
 */


import java.util.Scanner;

public class MLingkaran {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan nilai r: ");
        Double r = scan.nextDouble();
        Lingkaran l = new Lingkaran(r);
        
        System.out.println("Luas lingkaran dengan jejari " + r + " satuan adalah "  + l.hitungLuas());

    }

}
