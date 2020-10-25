import java.util.Scanner;

public class Consoane {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Nr consoane :" + countConsoane(s));

        String v = scanner.nextLine();
        poz_vocala(s, v.charAt(0));
    }

    private static int countConsoane(String s) {
        s= s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                count++;
            }
        }

        return count;
    }

    private static void poz_vocala(String s, char c) {
        s = s.toLowerCase();
        System.out.println("Pozitiile vocalei: ");

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                System.out.println(i);
            }
        }
    }
}
