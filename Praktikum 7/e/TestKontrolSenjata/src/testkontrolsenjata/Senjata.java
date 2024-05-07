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
}
