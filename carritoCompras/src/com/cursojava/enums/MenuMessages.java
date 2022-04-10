package com.cursojava.enums;

public enum MenuMessages {
    MESSAGE("Digite la opcion deseada: "),
    MESSAGE_CONTINUE("¿Desea hacer otra compra? (1.-SI 2.-NO):"),
    ERROR_MESSAGE("Error en la opcion digitada, debe ser numerica. Por favor digite una opcion entre 1 y 5. Intentelo nuevamente."),
    EXIT_ERROR_MESSAGE("Opcion %option fuera de rango. Por favor digite una opcion entre 1 y 2. Intentelo nuevamente.");

    private String message;

    private MenuMessages(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }
}
