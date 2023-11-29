public class Angajat implements Comparable<Object> {
    int varsta;
    String nume;

    Angajat(int varsta, String nume) {
        this.varsta = varsta;
        this.nume = nume;
    }

    public int compareTo(Object o) {
        Angajat other = (Angajat) o;
//        return varsta - other.varsta;
        return nume.compareTo(other.nume);
    }
}
