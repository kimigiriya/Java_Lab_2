package exceptions;
// Гипотетическое исключение, в программе его нельзя где-то выкинуть

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}