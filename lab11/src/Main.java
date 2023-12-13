public class Main {
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView(model);
        CalcController controller = new CalcController(model, view);
        view.setVisible(true);
    }
}