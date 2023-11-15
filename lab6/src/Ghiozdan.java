public class Ghiozdan {
    private static int nrRechizite = 0;
    public static final int MAX_SIZE = 100;
    private Rechizita[] listaRechizite;

    Ghiozdan() {
        listaRechizite = new Rechizita[MAX_SIZE];
    }

    void add(Caiet caiet) {
        listaRechizite[nrRechizite++] = caiet;
    }

    void add(Manual manual) {
        listaRechizite[nrRechizite++] = manual;
    }

    void listItems() {
        for (int i = 0; i < nrRechizite; i++) {
            System.out.println(listaRechizite[i]);
        }
    }

    void listManual() {
        for (int i = 0; i < nrRechizite; i++) {
            if (listaRechizite[i] instanceof Manual) {
                System.out.println(listaRechizite[i]);
            }
        }
    }

    void listCaiet() {
        for (int i = 0; i < nrRechizite; i++) {
            if (listaRechizite[i] instanceof Caiet) {
                System.out.println(listaRechizite[i]);
            }
        }
    }

    public int getNrRechizite() {
        return nrRechizite;
    }

    public int getNrManuale() {
        int count = 0;
        for (int i = 0; i < nrRechizite; i++) {
            if (listaRechizite[i] instanceof Manual) {
                count++;
            }
        }
        return count;
    }

    public int getNrCaiete() {
        int count = 0;
        for (int i = 0; i < nrRechizite; i++) {
            if (listaRechizite[i] instanceof Caiet) {
                count++;
            }
        }
        return count;
    }
}
