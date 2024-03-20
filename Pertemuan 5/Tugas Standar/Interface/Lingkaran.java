/*
 * Lingkaran.java 19/03/2024
 * Penulis: Ghirsan Ahdani
 * Deskripsi: Kelas implementasi IArea berupa
 *              cara menghitung luas lingkaran.
 */

import static java.lang.Math.PI;

class Lingkaran implements IArea{
    
    private double jejari;

    public Lingkaran(double r){

        jejari = r;

    }

    public double hitungLuas(){

        return PI * jejari * jejari;

    }

}
