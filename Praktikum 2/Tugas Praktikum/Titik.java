public class Titik{

    private double absis;
    private double ordinat;
    private static double counterTitik;

    public Titik(){

        absis = 0;
        ordinat = 0;
        counterTitik++;
    
    }

    public Titik(double absis, double ordinat){
    
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    
    }

    public void setAbsis(double x){
    
        absis = x;
    
    }

    public void setOrdinat(double y){
    
        ordinat = y;
    
    }
    
    public double getAbsis(){
    
        return absis;
    
    }

    public double getOrdinat(){
    
        return ordinat;
    
    }

    public static double getcounterTitik(){
    
        return counterTitik;
    
    }

    public double getJarakPusat(){
    
        return Math.sqrt(absis * absis + ordinat * ordinat);
    
    }
    
    public void refleksiX(){
    
        ordinat = -ordinat;
    
    }
    
    public void refleksiY(){
    
        absis = -absis;
    
    }

    public Titik getRefleksiX(){
    
        return new Titik(absis, -ordinat);
    
    }

    public Titik getRefleksiY(){
    
        return new Titik(-absis, ordinat);
    
    }

}