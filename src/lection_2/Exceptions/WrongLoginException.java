package lection_2.Exceptions;

public class WrongLoginException extends Exception {
    public WrongLoginException(String message) {
        super(message);
    }

    public WrongLoginException() {
        super("Логин введен неправильно.");
    }
}
