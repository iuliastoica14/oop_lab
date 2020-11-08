public class TestGhiozdan {

    public static void main(String[] args) {
        Ghiozdan g = new Ghiozdan();

        Caiet c1 = new Caiet("cu patratele");
        g.add(c1);

        Caiet c2 = new Caiet("dictando");
        g.add(c2);

        Caiet c3 = new Caiet("de notite");
        g.add(c3);

        Manual m1 = new Manual("matematica");
        g.add(m1);

        Manual m2 = new Manual("romana");
        g.add(m2);

        Manual m3 = new Manual("informatica");
        g.add(m3);

        Manual m4 = new Manual("poo");
        g.add(m4);

        System.out.println("Nr. Rechizite: "+g.getNrRechizite());
        System.out.println("Ne. Caiete: "+g.getNrCaiete());
        System.out.println("Nr. Manuale: "+g.getNrManuale());
        System.out.println();

        g.listItems();
        g.listCaiet();
        g.listManual();
    }

}
