import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        System.out.println(str1.compareTo(str2));
        Angajat a1 = new Angajat(25, "Gigel");
        Angajat a2 = new Angajat(30, "Costel");

        System.out.println(a1.compareTo(a2));

        Scanner keyboard = new Scanner(System.in);
        do {
            try {
                int pin = keyboard.nextInt();
                if (pin == 0) {
                    throw new ArithmeticException();
                }
                float hash = (float) 1 / pin;
                System.out.println(hash);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Caractere invalide");
                keyboard.next();
            } catch (ArithmeticException e) {
                System.out.println("Pinul nu poate fi 0");
            }
        } while(true);

        Lucrator l = new Lucrator("Gigel");
        try {
            l.lucreaza("Luni");
            l.lucreaza("Marti");
            l.lucreaza("Duminica");
        } catch (ZiNelucratoareException e) {
            System.out.println("Ziua nu este lucratoare!");
        }
    }

}