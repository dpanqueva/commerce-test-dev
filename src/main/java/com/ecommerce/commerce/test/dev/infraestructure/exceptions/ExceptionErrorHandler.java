package com.ecommerce.commerce.test.dev.infraestructure.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@ControllerAdvice
public class ExceptionErrorHandler {

    @ExceptionHandler({NotContentException.class})
    public ResponseEntity<Map<String, Object>> notContentException(Exception e) {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }


    @ExceptionHandler({Exception.class})
    public ResponseEntity<Map<String, Object>> internalServerException(Exception e) {
        Map<String, Object> response = new HashMap<>();
        response.put("Message", "UPS! Unexpected error, contact system administrator");
        log.error("Unexpected error: ".concat(e.getMessage()));
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(response);
    }
}
