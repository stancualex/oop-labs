import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Introduceti un intreg: ");
        int intreg = in.nextInt();
        System.out.println("Intregul citit este: " + intreg);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 10);
        System.out.println(Double.MAX_VALUE + 1);
        System.out.println(Double.MAX_VALUE / 0);
    }
}