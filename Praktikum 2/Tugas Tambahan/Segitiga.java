/* 
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * Kelas Segitiga dengan atribut alas dan tinggi serta fungsi operasi objek.
*/

public class Segitiga {
    
    private double alas;
    private double tinggi;
    

    public Segitiga(double alas, double tinggi){

        this.alas = alas;
        this.tinggi = tinggi;

    }

    public double getAlas(){

        return alas;

    }

    public double getTinggiSegitiga(){

        return tinggi;

    }

    public double hitungLuas(){

        return alas / 2 * tinggi;

    }

}
