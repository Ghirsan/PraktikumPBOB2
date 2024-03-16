/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: Buku.java 16/03/2024
 * Deskripsi: Reperesentasi dasar dari objek Buku.
 */

package bk.buku;

public class Buku{
    
    protected String judul, penulis, tahunTerbit;

    public Buku(String judul, String penulis, String tahunTerbit){

        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;

    }

    public String getJudul(){

        return judul;

    }
    
    public String getPenulis(){

        return penulis;

    }

    public String getTahunTerbit(){

        return tahunTerbit;

    }
    
    public void setJudul(String judul){

        this.judul = judul;

    }

    public void setPenulis(String penulis){

        this.penulis = penulis;

    }

    public void view(){

        System.out.println("Buku " + getJudul() + " ditulis oleh " + getPenulis() + " pada tahun " + getTahunTerbit());

    }

}
