public class Zi {
    private String nume;
    private boolean lucratoare;

    public Zi(String nume, boolean lucratoare) {
        this.nume = nume;
        this.lucratoare = lucratoare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    void setLucratoare() {
        lucratoare = true;
    }

    void setNelucratoare() {
        lucratoare = false;
    }

    boolean esteLucratoare() {
        return lucratoare;
    }
}
