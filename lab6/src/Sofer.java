public class Sofer {
    private String nume;
    private String prenume;
    private int varsta;
    private String nrPermisConducere;

    public Sofer(String nume, String prenume, int varsta, String nrPermisConducere) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.nrPermisConducere = nrPermisConducere;
    }

    public Sofer() {
        this.nume = "Popescu";
        this.prenume = "Ionel";
        this.varsta = 40;
        this.nrPermisConducere = "A00000000A";
    }

    String getNume() {
        return nume;
    }

    void setNume(String nume) {
        this.nume = nume;
    }

    String getPrenume() {
        return prenume;
    }

    void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    int getVarsta() {
        return varsta;
    }

    void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    String getNrPermisConducere() {
        return nrPermisConducere;
    }

    void setNrPermisConducere(String nrPermisConducere) {
        this.nrPermisConducere = nrPermisConducere;
    }
}