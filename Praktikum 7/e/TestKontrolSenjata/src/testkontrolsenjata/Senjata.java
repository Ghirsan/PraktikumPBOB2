/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testkontrolsenjata;

/**
 * NIM : 24060122120019
 * @author Ghirsan Ahdani
 */
public class Senjata{
    private String bunyi;
    private boolean menusuk;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
        this.menusuk = false;
    }
    
    public void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    public String getBunyi(){
        return bunyi;
    }
    
    public void setMenusuk(boolean menusuk){
        this.menusuk = menusuk;
    }
    
    public boolean isMenusuk(){
        return menusuk;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
//    public void menembak(int jumlah){
//        for(int i = 0; i < jumlah; i++){
//            System.out.print(getBunyi() + " ");
//        }
//        System.out.println("");
//    }
//    
//    public void pasangBayonet(){
//        setMenusuk(true);
//        System.out.println("Bayonet terpasang");
//    }
//    
//    public String menusuk(){
//        if(isMenusuk()){
//            return "Jleb!";
//        }else{
//            return "Gagal, belum pasang bayonet";
//        }
//    }
}
