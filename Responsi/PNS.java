/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 */

public class PNS extends NPWP{
    
    private String NIP;

    private Departmen departmen;
    public static int jmlPNS = 0;

    public PNS(String noKTP, String nama, String noNPWP, double tarifPajak, String NIP, Departmen departmen){

        super(noKTP, nama, noNPWP, tarifPajak);
        this.departmen = departmen;
        this.NIP = NIP;
        jmlPNS++;

    }

    public double getPajak(){

        return getTarifPajak() * departmen.getGajiPokok() * 12;

    }

    public static int getJmlPNS(){

        return jmlPNS;

    }

    @Override
    public void cetakInfo(){

        // TODO Auto-generated method stub
        super.cetakInfo();
        System.out.println("NPWP: " + getNoNPWP());
        System.out.println("Tarif: " + getTarifPajak());
        System.out.println("Pajak: " + getPajak());
        System.out.println("NIP: " + NIP);
        System.out.println("Departemen: " + departmen.getNama());
        System.out.println("GajiPokok: " + departmen.getGajiPokok());

    }

}
