public class ZiNelucratoareException extends Exception {
    public ZiNelucratoareException() {
        super("Ziua in care se incearca sa se lucreze este nelucratoare");
    }

    public ZiNelucratoareException(String message) {
        super(message);
    }
}
