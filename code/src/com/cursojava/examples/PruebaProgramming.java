package com.cursojava.examples;

import com.curso2java.tarea1.Menu;

import java.util.Scanner;

public class PruebaProgramming {

    private static Scanner inputInteger = new Scanner(System.in);

    public static void main(String[] args) {
        example2();
    }


    public static void example2() {

    }



    public static void recorridoZ(int rows, int cols, int[][] arreglo) {

    }




    //---- clase 1 curso 2 ----//
    public void example1() {
        Scanner inputInteger = new Scanner(System.in);
        System.out.println("Digite el tamaño del arreglo: ");
        int size = inputInteger.nextInt();

        int[] arreglo = new int[size];
        int pos;

        for(int i = 0; i < arreglo.length; i+=1) {
            System.out.println("Digite el valor de la posicion " +(i+1)+": ");
            pos = inputInteger.nextInt();
            arreglo[i] = pos;
        }

        for(int idx: arreglo) {
            System.out.println(idx+ " ");
        }
    }
}
