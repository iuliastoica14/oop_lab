public class Main {
    public static void main(String[] args) {
        Clasa c = new Clasa();
        try {
            c.f(-1);
        } catch (Exception2 e) {
            System.out.println(e.getMessage());
        }
    }
}
