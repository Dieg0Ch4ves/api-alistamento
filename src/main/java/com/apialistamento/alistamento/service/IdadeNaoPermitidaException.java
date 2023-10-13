package com.apialistamento.alistamento.service;

public class IdadeNaoPermitidaException extends RuntimeException {
    public IdadeNaoPermitidaException(String message) {
        super(message);
    }

    public IdadeNaoPermitidaException(String message, Throwable cause) {
        super(message, cause);
    }
}