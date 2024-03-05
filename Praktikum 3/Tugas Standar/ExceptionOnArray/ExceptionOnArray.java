/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: ExceptionOnArray.java
 * Deskripsi: Program penggunaan eksepsi menggunakan class library Java.
 */

public class ExceptionOnArray{

    public static void main(String[] args) {

        // instansiasi object array integer
        Integer[] arrayInteger = new Integer[4];

        // keungkinan terjadi eksepsi
        try{

            arrayInteger[2] = 11;
            arrayInteger[4] = 10;

        // menangani kesalahan terjadi
        }catch(ArrayIndexOutOfBoundsException exception){

            exception.printStackTrace();

        // kode dijalankan apapun kondisinya
        }finally{

            System.out.println("clean up code...");

        }

    }

}