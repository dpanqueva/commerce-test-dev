package com.ecommerce.commerce.test.dev.infraestructure.exceptions;

public class InternalServerException  extends RuntimeException{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public InternalServerException() {

    }

    public InternalServerException(String message) {
        super(message);
    }
}
