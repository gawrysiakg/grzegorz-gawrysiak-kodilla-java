package com.kodilla.exception.test;

public class RouteNotFoundException extends Exception {
    RouteNotFoundException(final String message) {
        super(message);
    }
}