public class PrismaSegitiga {
    
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma){

        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;

    }

    public double hitungVolume(){

        return alas.hitungLuas() * tinggiPrisma;

    }

    public double hitungLuasPermukaan(){

        return (2 * alas.hitungLuas()) + (alas.getAlas() * tinggiPrisma) + (alas.getTinggiSegitiga() * tinggiPrisma) + (Math.sqrt(alas.getAlas() * alas.getAlas() + alas.getTinggiSegitiga() * alas.getTinggiSegitiga()) * tinggiPrisma); // Segitiga siku-siku

    }

}
