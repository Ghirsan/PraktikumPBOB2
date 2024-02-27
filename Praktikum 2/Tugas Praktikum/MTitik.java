/* 
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
*/
public class MTitik {

    public static void main(String[] args) {

        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("Jumlah Objek titik : " + Titik.getcounterTitik());
        System.out.println("t1 : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2 : (" + t2.getAbsis() + ", " + t2.getOrdinat() +")");

        System.out.println("Jarak t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ") ke pusat adalah " + t1.getJarakPusat());

        t1.refleksiX();
        System.out.println("Refleksi sumbu x t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        t1.refleksiY();
        System.out.println("Refleksi sumbu y t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        Titik tRefleksiX = t2.getRefleksiX();
        System.out.println("Refleksi sumbu x tRefleksiX(" + tRefleksiX.getAbsis() + ", " + tRefleksiX.getOrdinat() + ")");

        Titik tRefleksiY = t2.getRefleksiY();
        System.out.println("Refleksi sumbu y tRefleksiY(" + tRefleksiY.getAbsis() + ", " + tRefleksiY.getOrdinat() + ")");

        System.out.println("Jumlah Objek titik : " + Titik.getcounterTitik());

    }

}

// Kesimpulan
/*
 * Perbedaan method refleksiX() dan refleksiY() dengan getRefleksiX() dan getRefleksiY() adalah:  
 *  refleksiX() dan refleksiY() mengubah nilai pada objeknya, 
 *  sedangkan getRefleksiX() dan getRefleksiY() mengembalikan nilai hasil fungsi objek yang diambil. 
 * 
 * Access modifier mempengaruhi dalam pemberlakuan enkapsulasi,
 * hal ini dilakukan sebagaimana menyembunyikan atribut, konstruktor, dan method sesuai kondisi yang dibutuhkan.
 * 
 * Public berarti atribut, konstruktor, atau method dapat diakses pada kelas lain.
 * Private berarti atribut, konstruktor, atau method hanya dapat diakeses di dalam kelasnya.
 */