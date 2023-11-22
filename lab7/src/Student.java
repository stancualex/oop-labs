public class Student implements Cloneable {
    public String nume;
    public String prenume;
    public Masina masina;

    Student(String nume, String prenume, Masina masina) {
        this.nume = nume;
        this.prenume = prenume;
        this.masina = masina;
    }

    Student() {
        this("Ion", "Popescu", new Masina());
    }

    @Override
    public Student clone() {
        try {
            Student clone = (Student) super.clone();
            clone.nume = String.valueOf(nume);
            clone.prenume = String.valueOf(nume);
            clone.masina = masina.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", masina=" + masina +
                '}';
    }
}
