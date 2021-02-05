public class MyException extends Exception {
    public MyException() {
        super("Exception - duplicate is prohibited");
    }

    public MyException(String message) {
        super(message);
    }
}
