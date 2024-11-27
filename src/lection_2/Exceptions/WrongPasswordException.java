package lection_2.Exceptions;

public class WrongPasswordException extends RuntimeException {

    public WrongPasswordException(String message) {
        super(message);
    }

    public WrongPasswordException() {
        super("Пароль введен неправильно.");
    }

}
