/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: MPoligon.java 16/03/2024
 * Deskripsi: Driver class untuk Poligon, PersegiPanjang, dan Segitiga.
 */

package org.main;

import org.bangundatar.*;

public class MPoligon{
    
    public static void main(String[] args){

        PersegiPanjang persegi = new PersegiPanjang(10, 10, 4);
        persegi.printInfo();
        System.out.println("Luas persegi panjang: " + persegi.hitungLuas());

        Segitiga segitiga = new Segitiga(2, 3, 3);
        segitiga.printInfo();
        System.out.println("Luas segitiga: " + segitiga.hitungLuas());

    }

}
