/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: bukuNonFiksi.java 16/03/2024
 * Deskripsi: Reperesentasi dari objek bukuNonFiksi, turunan kelas Buku.
 */

package bk.bukunonFiksi;

import bk.buku.*;

public class bukuNonFiksi extends Buku{
    
    private String subjek;
    private int jumlahHalaman;
    private double harga;

    public bukuNonFiksi(String judul, String penulis, String tahunTerbit, String subjek, int jumlahHalaman, double harga){

        super(judul, penulis, tahunTerbit);
        this.subjek = subjek;
        this.jumlahHalaman = jumlahHalaman;
        this.harga = harga;

    }

    public String getSubjek(){

        return subjek;

    }

    public int getJumlahHalaman(){

        return jumlahHalaman;

    }

    public double getHarga(){

        return harga;

    }

    public void setSubjek(String subjek){

        this.subjek = subjek;

    }

    public void setJumlahHalaman(int jumlahHalaman){

        this.jumlahHalaman = jumlahHalaman;

    }

    @Override
    public void view(){

        super.view();
        System.out.println("Non-fiksi subjek " + getSubjek() + ", " + getJumlahHalaman() + " halaman, harga " + getHarga() + "\n");

    }

}
