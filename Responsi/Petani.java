/*
 * Nama: Ghirsan Ahdani
 * NIM: 24060122120019
 */

public class Petani extends Penduduk{
    
    private String kota;
    private String jenisTani;
    private static int jmlPetani;

    public Petani(String noKTP, String nama, String kota, String jenisTani){

        super(noKTP, nama);
        this.kota = kota;
        this.jenisTani = jenisTani;
        jmlPetani++;

    }

    public String getKota(){

        return kota;

    }

    public String getJenisTani(){

        return jenisTani;

    }

    public static int getJmlPetani(){

        return jmlPetani;

    }

    @Override
    public void cetakInfo(){

        super.cetakInfo();
        System.out.println("Kota: " + getKota());
        System.out.println("Jenis Tani: " + getJenisTani());

    }

}
