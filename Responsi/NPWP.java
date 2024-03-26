/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 */

public abstract class NPWP extends Penduduk{
    
    private String noNPWP;
    private double tarifPajak;

    public NPWP(String noKTP, String nama, String noNPWP, double tarifPajak){

        super(noKTP, nama);
        this.noNPWP = noNPWP;
        this.tarifPajak = tarifPajak;

    }

    public String getNoNPWP(){

        return noNPWP;

    }

    public double getTarifPajak(){

        return tarifPajak;

    }

    public String setNoNPWP(String noNPWP){

        return this.noNPWP = noNPWP;

    }

    public double setTarifPajak(double tarifPajak){

        return this.tarifPajak = tarifPajak;

    }

    public abstract double getPajak();

}
