/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: Segitiga.java 16/03/2024
 * Deskripsi: Reperesentasi dari objek Segitiga, turunan kelas Poligon.
 */

package org.bangundatar;

import org.poligon.Poligon;

public class Segitiga extends Poligon{
    
    private double alas, tinggi;

    public Segitiga(double alas, double tinggi, int jumlahSisi){

        this.alas = alas;
        this.tinggi = tinggi;
        this.jumlahSisi = jumlahSisi;

    }

    public double hitungLuas(){

        return alas/2 * tinggi;

    }

    public void printInfo(){

        System.out.println("Bangun segitiga bersisi " + this.getJumlahSisi());

    }

}
