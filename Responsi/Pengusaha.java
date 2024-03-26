/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 */

public class Pengusaha extends NPWP{
        
    private String noSIUP;
    private double omset;
    private static int jmlPengusaha = 0;

    public Pengusaha(String noKTP, String nama, String noNPWP, double tarifPajak, String noSIUP, double omset){

        super(noKTP, nama, noNPWP, tarifPajak);
        this.noSIUP = noSIUP;
        this.omset = omset;
        jmlPengusaha++;

    }

    public String getNoSIUP(){

        return noSIUP;

    }

    public double getOmset(){

        return omset;

    }

    public double getPajak(){

        return getTarifPajak() * getOmset();

    }

    public static int getJmlPengusaha(){

        return jmlPengusaha;

    }

    @Override
    public void cetakInfo(){

        super.cetakInfo();
        System.out.println("NPWP: " + getNoNPWP());
        System.out.println("Tarif: " + getTarifPajak());
        System.out.println("Pajak: " + getPajak());
        System.out.println("Departemen: " + getNoSIUP());
        System.out.println("GajiPokok: " + getOmset());

    }

}
