import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if (0.1 + 0.1 + 0.1 == 0.3) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }

        String str1 = "Ana are ";
        String str2 = "mere";
        String str3 = str1 + str2;
        System.out.println(str3 == "Ana are mere");
        System.out.println(str3.equals("Ana are mere"));

        int inaltime = 175;
        int gen = 1;
        int varsta = 34;

        short wrap = (short) (inaltime | (gen << 8) | (varsta << 9));
        int inaltimeUnwrapped = wrap & 0xFF;
        int genUnwrapped = (wrap >> 8) & 0x1;
        int varstaUnwrapped = (wrap >> 9) & 0x7F;

        System.out.println(inaltimeUnwrapped);
        System.out.println(genUnwrapped);
        System.out.println(varstaUnwrapped);

        int x = 5;
        int y = 3;
        x ^= y;
        y ^= x;
        x ^= y;
        System.out.println(x);
        System.out.println(y);

        Scanner in = new Scanner(System.in);
        int nr_vocale = 0;
        int nr_consoane = 0;
        String vocale = "aeiou";
        for (char c : str3.toLowerCase().toCharArray()) {

        }
        System.out.print("Introduceti o vocala: ");
        char vocala = in.nextLine().toCharArray()[0];
        if (vocale.indexOf(vocala) == -1) {
            System.out.println("Caracterul introdus nu este o vocala!");
            System.exit(1);
        }
    }
}