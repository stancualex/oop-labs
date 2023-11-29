public class Lucrator {
    private String nume;
    private CalendarLucru calendarLucru;

    public Lucrator(String nume) {
        this.nume = nume;
        this.calendarLucru = new CalendarLucru();
    }

    public void lucreaza(String numeZi) throws ZiNelucratoareException {
        Zi zi = calendarLucru.getZi(numeZi);
        if (!zi.esteLucratoare()) {
            throw new ZiNelucratoareException();
        }
        System.out.println("Ziua a fost lucrata cu succes");
    }
}
