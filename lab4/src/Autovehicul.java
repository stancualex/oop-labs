import java.awt.Color;

public class Autovehicul {
    private String marca;
    private Color culoare;
    private float vitezaCurenta;
    private float vitezaMaxima;
    private int treaptaVitezaCurenta;
    private int numarTrepte;
    Sofer sofer;

    public Autovehicul(String marca, Color culoare, float vitezaMaxima, int numarTrepte) {
        this.marca = marca;
        this.culoare = culoare;
        this.vitezaCurenta = 0.f;
        this.vitezaMaxima = vitezaMaxima;
        this.treaptaVitezaCurenta = 1;
        this.numarTrepte = numarTrepte;
        this.sofer = new Sofer();
    }
    public Autovehicul() {
        this.marca = "Audi";
        this.culoare = Color.WHITE;
        this.vitezaCurenta = 0.f;
        this.vitezaMaxima = 200.f;
        this.treaptaVitezaCurenta = 1;
        this.numarTrepte = 6;
        this.sofer = new Sofer();
    }

    String getMarca() {
        return marca;
    }
    void setMarca(String marca) {
        this.marca = marca;
    }
    Color getCuloare() {
        return culoare;
    }
    void setCuloare(Color culoare) {
        this.culoare = culoare;
    }
    float getVitezaCurenta() {
        return vitezaCurenta;
    }
    float getVitezaMaxima() {
        return vitezaMaxima;
    }
    void setVitezaMaxima(float vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
    }
    int getTreaptaVitezaCurenta() {
        return treaptaVitezaCurenta;
    }
    int getNumarTrepte() {
        return numarTrepte;
    }
    void setNumarTrepte(int numarTrepte) {
        this.numarTrepte = numarTrepte;
    }

    void accelerare(float delta) {
        if (vitezaCurenta + delta <= vitezaMaxima) {
            vitezaCurenta += delta;
        }
    }
    void decelerare(float delta) {
        if (vitezaCurenta - delta >= 0.f) {
            vitezaCurenta -= delta;
        }
    }
    void oprire() {
        vitezaCurenta = 0.f;
    }
    void modificareTreapta(int treaptaNoua) {
        if (treaptaNoua > 0 && treaptaNoua <= numarTrepte) {
            treaptaVitezaCurenta = treaptaNoua;
        }
    }

    void prettyPrint() {
        String toPrint = "Autovehicul {\n";
        toPrint += "\tmarca = " + marca + ";\n";
        toPrint += "\tculoare = " + culoare.toString() + ";\n";
        toPrint += "\tvitezaCurenta = " + vitezaCurenta + ";\n";
        toPrint += "\tvitezaMaxima = " + vitezaMaxima + ";\n";
        toPrint += "\ttreaptaVitezaCurenta = " + treaptaVitezaCurenta + ";\n";
        toPrint += "\tnumarTrepte = " + numarTrepte + ";\n";
        toPrint += "\tsofer = " + sofer.prettyString() + ";\n";
        toPrint += "}\n";
        System.out.println(toPrint);
    }
}
