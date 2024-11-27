package lection_2;

import lection_2.Exceptions.WrongLoginException;
import lection_2.Exceptions.WrongPasswordException;

public class Authorization {

    public static boolean login(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException e) {
            e.printStackTrace();
            return false;
        }

    }
    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() > 20) {
            throw new WrongLoginException("Логин слишком длинный. Максимальная длина — 20 символов.");
        }
        if (!login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Логин содержит недопустимые символы. Допустимы только латинские буквы, цифры и символ подчеркивания.");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() > 20) {
            throw new WrongPasswordException("Пароль слишком длинный. Максимальная длина — 20 символов.");
        }
        if (!password.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы. Допустимы только латинские буквы, цифры и символ подчеркивания.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
    }


}
