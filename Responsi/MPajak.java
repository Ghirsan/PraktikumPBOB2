/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 */

public class MPajak {
    public static void main(String[] args) {
        Departmen D1 = new Departmen("Pendidikan",4000000);
        PNS P1 = new PNS("1234","Andi","1001", 10, "2222",D1);
        Pengusaha P2 = new Pengusaha("1235","Arif","1002",10,"2221", 400000000);
        Petani P3 = new Petani("1236","Budi","Bogor","Teh");
        
        P1.cetakInfo();
        P2.cetakInfo();
        P3.cetakInfo();
        
        System.out.println("Jumlah PNS = " + PNS.getJmlPNS());
        System.out.println("Jumlah Wirausaha = " + Pengusaha.getJmlPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getJmlPetani());
    
    }
}