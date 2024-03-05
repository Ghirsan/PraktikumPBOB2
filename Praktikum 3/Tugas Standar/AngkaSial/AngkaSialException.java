/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: AngkaSialException.java
 * Deskripsi: Eksepsi buatan sendiri, menolak masukan angka 13!
 */

public class AngkaSialException extends Exception{

    public AngkaSialException(){

        super("jangan masukkan angka 13 karena angka sial!!!");

    }

}