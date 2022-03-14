package com.curso2java.tarea1;

import java.util.Scanner;

public class Menu {

    private static Scanner inputInteger = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("Menu Opciones");
        System.out.println("1. Recorrido Vertical");
        System.out.println("2. Recorrido Horizontal");
        System.out.println("3. Recorrido en Z");
        System.out.println("4. Recorrido N");
    }

    public static int getOption() {
        int opcion = inputInteger.nextInt();
        return opcion;
    }

    public static void switchOptions(int opcion, int[][] arreglo) {
        switch (opcion) {
            case 1:
                new Recorrido.Builder(arreglo).cols(arreglo.length).rows(arreglo.length).tipoRecorrido(1).build().execute();
                break;
            case 2:
                new Recorrido.Builder(arreglo).cols(arreglo.length).rows(arreglo.length).tipoRecorrido(2).build().execute();
                break;
            case 3:
                new Recorrido.Builder(arreglo).cols(arreglo.length).rows(arreglo.length).tipoRecorrido(3).build().execute();
                break;
            case 4:
                new Recorrido.Builder(arreglo).cols(arreglo.length).rows(arreglo.length).tipoRecorrido(4).build().execute();
                break;
        }
    }
}
