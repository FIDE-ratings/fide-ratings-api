package fide.ratings.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Player with this ID not found")
public class PlayerNotFoundException extends RuntimeException {
    public PlayerNotFoundException() {
        super();
    }
}
