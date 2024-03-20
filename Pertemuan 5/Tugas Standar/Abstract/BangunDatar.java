/*
 * BangunDatar.java 19/03/2024
 * Penulis: Ghirsan Ahdani
 * Deskripsi: Kelas abstrak, berisi abstraksi bangun datar.
 */

public abstract class BangunDatar{

    protected double luas;

    public abstract double hitungLuas(double sisi);

    public void setLuas(double L){

        luas = L;

    }

    public double getLuas(){

        return luas;

    }

}