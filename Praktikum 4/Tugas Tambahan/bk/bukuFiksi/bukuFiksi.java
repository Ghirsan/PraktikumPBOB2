/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: bukuFiksi.java 16/03/2024
 * Deskripsi: Reperesentasi dari objek bukuFiksi, turunan kelas Buku.
 */

package bk.bukuFiksi;

import bk.buku.*;

public class bukuFiksi extends Buku{

    private String genre;
    private int jumlahHalaman;
    private double harga;

    public bukuFiksi(String judul, String penulis, String tahunTerbit, String genre, int jumlahHalaman, double harga){

        super(judul, penulis, tahunTerbit);
        this.genre = genre;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;

    }

    public String getGenre(){

        return genre;

    }

    public int getJumlahHalaman(){

        return jumlahHalaman;

    }

    public double getHarga(){

        return harga;

    }

    public void setGenre(String genre){

        this.genre = genre;

    }

    public void setJumlahHalaman(int jumlahHalaman){

        this.jumlahHalaman = jumlahHalaman;

    }

    @Override
    public void view(){

        super.view();
        System.out.println("Fiksi genre " + getGenre() + ", " + getJumlahHalaman() + " halaman, harga " + getHarga() + "\n");

    }

}
