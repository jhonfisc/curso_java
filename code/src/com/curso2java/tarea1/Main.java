package com.curso2java.tarea1;

import java.util.Scanner;

public class Main {

    private static Scanner inputInteger = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arreglo = initArreglo();
        Menu.showMenu();
        int opcion = Menu.getOption();
        Menu.switchOptions(opcion, arreglo);
    }

    public static int[][] initArreglo() {
        System.out.println("Digite el numero de filas: ");
        int rows = inputInteger.nextInt();
        int[][] arreglo  = new int[rows][rows];
        insertData(arreglo);
        return arreglo;
    }

    public static int[][] insertData(int[][] arreglo) {
        for(int i = 0; i < arreglo.length; i += 1) {
            for(int j = 0; j < arreglo[0].length; j += 1) {
                System.out.println("Digite la posicion " +i + "," + j + ": ");
                int data = inputInteger.nextInt();
                arreglo[i][j] = data;
            }
        }
        return arreglo;
    }
}
