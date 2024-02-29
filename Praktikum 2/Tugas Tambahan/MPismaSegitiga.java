public class MPismaSegitiga {

    public static void main(String[] args){

        Segitiga tri = new Segitiga(3, 4);

        PrismaSegitiga pristri = new PrismaSegitiga(tri, 5);

        System.out.println("Volume prisma segitiga: " + pristri.hitungVolume());

        System.out.println("Luas permukaan prisma segitiga: " + pristri.hitungLuasPermukaan());

    }

}