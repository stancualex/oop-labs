public class Masina implements Cloneable {
    public String marca;
    public String culoare;

    Masina(String marca, String culoare) {
        this.marca = marca;
        this.culoare = culoare;
    }

    Masina() {
        this("Ferrari", "Rosu");
    }

    @Override
    public Masina clone() {
        try {
            Masina clone = (Masina) super.clone();
            clone.marca = String.valueOf(marca);
            clone.culoare = String.valueOf(culoare);
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Masina{" +
                "marca='" + marca + '\'' +
                ", culoare='" + culoare + '\'' +
                '}';
    }
}
