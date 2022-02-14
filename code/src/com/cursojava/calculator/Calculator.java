package com.cursojava.calculator;

public class Calculator {
    private final int MAX_PRECISION = 2;
    private final int MIN_PRECISION = 0;
    private final String ERROR_MESSAGE_PRECISION = "\"Invalid precision, by default set in 2\"";
    private int precision = 2;
    public static int i = 1;

    public Calculator() {
    }

    public Calculator(int precision) {
        if (MIN_PRECISION <= precision && precision <= MAX_PRECISION) {
            this.precision = precision;
        } else {
            System.out.println(ERROR_MESSAGE_PRECISION);
        }
    }

    public double sumar(double primerOperando, double segundoOperando) {
        return round(primerOperando + segundoOperando);
    }

    public double restar(double primerOperando, double segundoOperando) {
        return round(primerOperando - segundoOperando);
    }

    public double multiplicar(double primerOperando, double segundoOperando) {
        return round(primerOperando * segundoOperando);
    }

    public double dividir(double primerOperando, double segundoOperando) {
        if (segundoOperando != 0) {
            return round(primerOperando / segundoOperando);
        } else {
            System.out.println("Divided by zero error");
            return 0;
        }
    }

    private double round(double result) {
        double divideRound;
        if (precision == 2) {
            divideRound = 100.0;
        } else if (precision == 1) {
            divideRound = 10.0;
        } else {
            divideRound = 10.0;
        }
        return Math.round(result * divideRound ) / divideRound;
    }
}
