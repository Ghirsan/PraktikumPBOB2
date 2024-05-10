/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generic;

/**
 * NIM: 24060122120019
 * @author Ghirsan Ahdani
 */

abstract class Kupu{
    abstract void gerak();
}

class Ulat extends Kupu{
    void gerak(){
        System.out.println("Ulat merayap.");
    }
}

class Kepompong extends Kupu{
    void gerak(){
        System.out.println("Kepompong diam.");
    }
}

class KupuDewasa extends Kupu{
    void gerak(){
        System.out.println("Kupu terbang.");
    }
}

class Data<T>{
    T isi;
    
    T getIsi(){
        return this.isi;
    }
    
    void setIsi(T x){
        this.isi = x;
    }
}

public class Generic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ulat K;
        Data<Kupu> anu;
        
        K = new Ulat();
        anu = new Data<>();
        
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
    
}
