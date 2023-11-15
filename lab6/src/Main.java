public class Main {
    public static void main(String[] args) {
        Ghiozdan ghiozdan = new Ghiozdan();
        Caiet caiet1 = new Caiet("caiet1");
        Caiet caiet2 = new Caiet("caiet2");
        Caiet caiet3 = new Caiet("caiet3");
        Caiet caiet4 = new Caiet("caiet4");
        Manual manual1 = new Manual("manual1");
        Manual manual2 = new Manual("manual2");
        Manual manual3 = new Manual("manual3");
        Manual manual4 = new Manual("manual4");

        ghiozdan.add(caiet1);
        ghiozdan.add(caiet2);
        ghiozdan.add(caiet3);
        ghiozdan.add(caiet4);
        ghiozdan.add(manual1);
        ghiozdan.add(manual2);
        ghiozdan.add(manual3);
        ghiozdan.add(manual4);
        ghiozdan.listItems();
        ghiozdan.listManual();
        ghiozdan.listCaiet();
    }
}