/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: AngkaSial.java
 * Deskripsi: Program penggunaan exception buatan sendiri, pengenalan klausa 'throw' dan 'throws'.
 */

public class AngkaSial {
    
    public void cobaAngka(int angka) throws AngkaSialException{

        if (angka == 13){

            throw new AngkaSialException();

        }

        System.out.println(angka + " bukan angka sial");
    }

    public static void main(String[] args){

         AngkaSial as = new AngkaSial();

        try{

            as.cobaAngka(10);
            as.cobaAngka(13);
            as.cobaAngka(12);

        }catch(AngkaSialException ase){

            // method getMessage() telah ada pada kelas "Exception"
            System.out.println(ase.getMessage());
            System.out.println("hati-hati memasukkan angka!!!");

        }

    }

}

/*
 * Penjelasan:
 * 
 * Ketika eksepsi terjadi, kode pada baris 14 (pada program di atas) tidak dieksekusi
 * karena kondisi angka memenuhi percabangan yaitu angka == 13.
 * 
 * Kemudian, kode pada baris 31 (pada program di atas) dijalankan atas dasar perintah throw pada percabangan.
 * perintah catch menangkap perintah yang dilempar dari method AngkaSialException yang mengeluarkan pesan:
 * "jangan masukkan angka 13 karena angka sial!!!"
 */