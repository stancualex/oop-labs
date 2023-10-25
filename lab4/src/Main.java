import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Autovehicul a1 = new Autovehicul("Audi", Color.WHITE, 200.f, 6);
        a1.accelerare(20);
        a1.decelerare(5);
        a1.modificareTreapta(2);
        a1.prettyPrint();
    }
}