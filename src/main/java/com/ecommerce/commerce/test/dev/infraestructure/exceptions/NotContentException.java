package com.ecommerce.commerce.test.dev.infraestructure.exceptions;

public class NotContentException extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public NotContentException() {

    }

    public NotContentException(String message) {
        super(message);
    }

}
