public class Autobuz extends Autovehicul {
    private int ruta;

    public Autobuz(float vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }

    public float accelerare(int delta) {
        if (vitezaCurenta + delta <= vitezaMaxima) {
            vitezaCurenta += delta;
        }
        return vitezaCurenta;
    }
}
