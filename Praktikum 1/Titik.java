public class Titik{
    double absis;
    double ordinat;
    static double counterTitik;

    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }
    
    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    static double getcounterTitik(){
        return counterTitik;
    }
    
}
