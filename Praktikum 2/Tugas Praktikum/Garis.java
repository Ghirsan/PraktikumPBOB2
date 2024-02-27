public class Garis {

    private Titik titikAwal;
    private Titik titikAkhir;

    public Garis(){
    
        titikAwal = new Titik(0, 0);
        titikAkhir = new Titik(0, 0);
    
    }

    public Garis(Titik titikAwal, Titik titikAkhir){
    
        this.titikAwal = titikAwal;
        this.titikAkhir = titikAkhir;
    
    }

    public Titik getTitikAwal(){
    
        return titikAwal;
    
    }

    public Titik getTitikAkhir(){
    
        return titikAkhir;
    
    }

    public double getPanjang(){
    
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        return Math.sqrt(absis * absis + ordinat * ordinat);
    
    }

    public double getGradien(){
    
        double absis = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double ordinat = titikAkhir.getOrdinat() - titikAwal.getOrdinat();

        return ordinat / absis;

    }

    public Garis getRefleksiY(){
    
        Titik titikAwalRefleksi = titikAwal.getRefleksiY();
        Titik titikAkhirRefleksi = titikAkhir.getRefleksiY();

        return new Garis(titikAwalRefleksi, titikAkhirRefleksi);
    
    }

    public boolean isTegakLurus(Garis G){
    
        return getGradien() * G.getGradien() == -1;
    
    }

}