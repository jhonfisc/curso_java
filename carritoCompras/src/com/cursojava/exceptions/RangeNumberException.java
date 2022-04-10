package com.cursojava.exceptions;

public class RangeNumberException extends Exception{

    private final String ERROR_MESSAGE = "Opcion %option fuera de rango. Por favor digite una opcion entre 1 y 5.";
    private final String EXIT_ERROR_MESSAGE = "Opcion %option fuera de rango. Por favor digite una opcion entre 1 y 2.";
    private Number option;

    public RangeNumberException(Number option) {
        this.option = option;
    }

    public String getMessage() {
        return ERROR_MESSAGE.replace("%option", option.toString());
    }

    public String getExitMessage() {
        return EXIT_ERROR_MESSAGE.replace("%option", option.toString());
    }
}
