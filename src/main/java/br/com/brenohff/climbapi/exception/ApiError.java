package br.com.brenohff.climbapi.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
class ApiError {

    private HttpStatus status;
    private String message;

    ApiError(HttpStatus status, String messagea) {
        super();
        this.status = status;
        this.message = message;
    }
}