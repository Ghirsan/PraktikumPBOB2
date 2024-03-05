/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: Asersi2.java
 * Deskripsi: Program untuk demo asersi, yang akan menolak input jari-jari lingkaran yang bernilai nol.
 */

class Lingkaran{

    private double jariJari;
    
    public Lingkaran(double jariJari){

        this.jariJari = jariJari;

    }

    public double hitungKeliling(){

        double keliling = 2 * Math.PI * jariJari;
        return keliling;

    }

}

public class Asersi2{

    public static void main(String[] args){

        double jariJari = 1;
        
        assert(jariJari > 0): "jari jari tidak boleh nol!!!";
        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();

        System.out.println("keliling lingkaran = " + kelilingLingkaran);

    }

}

/*
 * Penjelasan:
 * 
 * Pada program di atas, kesalahan konsep ada pada pembatasan inputannya hanya berlaku untuk bilangan dibawah nol.
 * Apabila jariJari bernilai negatif, asersi menangkap perlakuan yang sama yaitu mengeluarkan pesan:
 * "jari jari tidak boleh nol!!!"
 */