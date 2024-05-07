/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testkontrolsenjata;

/**
 * NIM : 24060122120019
 * @author Ghirsan Ahdani
 */
public class KontrolSenjata{
    Senjata senjata;
    
    public KontrolSenjata(Senjata s){
        senjata = s;
    }
    
    public boolean isAdaPeluru(){
        if(senjata.getPeluru() > 0){
            return true;
        }else{
            return false;
        }
    }
    
    public void isiPeluru(int jumPeluru){
        senjata.setPeluru(jumPeluru);
        System.out.printf(">> Peluru berhasil ditambah: %d\n", jumPeluru);
    }
    
    public void menembak(int jumlah){
        System.out.printf(">> Siap menembak %d kali\n", jumlah);
        
        if(isAdaPeluru() == true){
            for(int i = 0; i < jumlah; i++){
                if(senjata.getPeluru() > 0){
                    senjata.setPeluru(senjata.getPeluru() - 1);
                    System.out.println(senjata.getBunyi());
                }else{
                    System.out.println("Gagal tembak, peluru habis");
                }
            }
            System.out.printf(">> Peluru sisa: %d\n", senjata.getPeluru());
        }else{
            System.out.println("Peluru habis");
        }
    }
    
    public String menusuk(){
        if(senjata.isMenusuk()){
            return "Jleb!";
        }else{
            return "Gagal, belum pasang bayonet";
        }
    }
    
    public void pasangBayonet(){
        senjata.setMenusuk(true);
        System.out.println("Bayonet terpasang");
    }
}
