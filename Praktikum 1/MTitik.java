public class MTitik {
    public static void main(String[] args) {
        Titik t1 = new Titik();
        t1.setAbsis(1);
        t1.setOrdinat(2);

        Titik t2 = new Titik();
        t2.setAbsis(3);
        t2.setOrdinat(4);

        System.out.println("Jumlah Objek titik : " + Titik.getcounterTitik());
        System.out.println("t1 : (" + t1.getAbsis() + "," + t1.getOrdinat() + ")");
        System.out.println("t2 : (" + t2.getAbsis() + "," + t2.getOrdinat() +")");
    }
}