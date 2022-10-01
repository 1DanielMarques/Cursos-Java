package contaBancaria.model.exceptions;

public class InvalidValueException extends RuntimeException {
    public InvalidValueException(String msg) {
        super(msg);
    }
}
