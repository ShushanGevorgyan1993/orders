package am.order.models.Exceptions;

public class CountryNotSupportedException extends RuntimeException{
    public CountryNotSupportedException(String message) {
        super(message);
    }
}
