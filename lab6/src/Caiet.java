public class Caiet extends Rechizita {
    Caiet(String nume) {
        eticheta = nume;
    }

    @Override
    String getNume() {
        return "Caiet: " + eticheta;
    }
}
