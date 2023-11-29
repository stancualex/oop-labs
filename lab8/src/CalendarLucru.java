public class CalendarLucru {
    private static final Zi[] zile = new Zi[] {
            new Zi("Luni", true),
            new Zi("Marti", true),
            new Zi("Miercuri", true),
            new Zi("Joi", true),
            new Zi("Vineri", true),
            new Zi("Sambata", false),
            new Zi("Duminica", false)
    };

    public Zi getZi(String name) {
        Zi result = null;
        for (Zi zi : zile) {
            if (zi.getNume().equals(name)) {
                result = zi;
                break;
            }
        }
        return result;
    }
}
