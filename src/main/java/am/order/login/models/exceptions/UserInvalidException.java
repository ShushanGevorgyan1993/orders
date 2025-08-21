package am.order.login.models.exceptions;

public class UserInvalidException extends  RuntimeException {
    public UserInvalidException(String message) {
        super(message);
    }
}

