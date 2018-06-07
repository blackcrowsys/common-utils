package com.blackcrowsys.commonutils.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
public class UnauthorisedException extends RuntimeException {
    public UnauthorisedException() {
        super();
    }

    public UnauthorisedException(String message) {
        super(message);
    }

    public UnauthorisedException(Throwable cause) {
        super(cause);
    }

    public UnauthorisedException(String message, Throwable cause) {
        super(message, cause);
    }
}
