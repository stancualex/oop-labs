public class AnBisect {
    public static boolean esteAnBisect(int an) {
        return an % 400 == 0 || (an % 100 != 0 && an % 4 == 0);
    }
}
