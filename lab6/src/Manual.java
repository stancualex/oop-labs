public class Manual extends Rechizita {
    Manual(String nume) {
        eticheta = nume;
    }

    @Override
    String getNume() {
        return "Manual: " + eticheta;
    }
}
