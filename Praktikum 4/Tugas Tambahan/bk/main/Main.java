/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 * File: Main.java 16/03/2024
 * Deskripsi: Driver class untuk Buku dan sub-class-nya.
 */

package bk.main;

import bk.buku.Buku;
import bk.bukuFiksi.*;
import bk.bukunonFiksi.*;

public class Main {

    public static void main(String[] args){
        
         // Creating instances of different types of books
        Buku buku1 = new Buku("Java Programming", "John Doe", "2020");
        buku1.view();

        bukuFiksi bukuFiksi1 = new bukuFiksi("Harry Potter", "J.K. Rowling", "1997", "Fantasy", 300, 25.99);
        bukuFiksi1.view();

        bukuNovel bukuNovel1 = new bukuNovel("To Kill a Mockingbird", "Harper Lee", "1960", "Fiction", 281, 12.50);
        bukuNovel1.view();

        bukuNonFiksi bukuNonFiksi1 = new bukuNonFiksi("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "2011", "Anthropology", 443, 19.99);
        bukuNonFiksi1.view();

        bukuAkademik bukuAkademik1 = new bukuAkademik("Introduction to Algorithms", "Thomas H. Cormen", "1989", "Computer Science", 1312, 49.99);
        bukuAkademik1.view();

    }

}
