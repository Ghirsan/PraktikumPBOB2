/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 */

public class Penduduk{

    private String noKTP;
    private String nama;

    public Penduduk(String noKTP, String nama){

        this.noKTP = noKTP;
        this.nama = nama;

    }

    public String getNoKTP(){

        return noKTP;

    }

    public String getNama(){

        return nama;

    }

    public void cetakInfo(){

        System.out.println("No KTP: " + getNoKTP());
        System.out.println("Nama: " + getNama());

    }

}
