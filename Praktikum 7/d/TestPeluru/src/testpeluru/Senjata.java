/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testpeluru;

/**
 * NIM : 24060122120019
 * @author Ghirsan Ahdani
 */
public class Senjata{
    private String bunyi;
    private int peluru;
    
    public Senjata(String bunyi){
        this.bunyi = bunyi;
    }
    
    private void setBunyi(String bunyi){
        this.bunyi = bunyi;
    }
    
    private String getBunyi(){
        return bunyi;
    }
    
    public void setPeluru(int peluru){
        this.peluru = peluru;
    }
    
    public int getPeluru(){
        return peluru;
    }
    
    public void menembak(){
        setPeluru(getPeluru() - 1);
        System.out.println(getBunyi() + " ");
    }
}
