public class Autovehicul {
    protected Sofer sofer;
    protected float vitezaCurenta;
    protected float vitezaMaxima;

    public Autovehicul(Sofer sofer) {
        this.sofer = sofer;
    }

    public Autovehicul() {};

    public void accelerare(float delta) {
        if (vitezaCurenta + delta <= vitezaMaxima) {
            vitezaCurenta += delta;
        }
    }
}
