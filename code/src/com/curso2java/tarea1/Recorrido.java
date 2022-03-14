package com.curso2java.tarea1;

public class Recorrido {
    private int[][] arreglo;
    private int rows;
    private int cols;
    private int tipoRecorrido;

    protected Recorrido(Builder builder) {
        this.arreglo = builder.arreglo;
        this.cols = builder.cols;
        this.rows = builder.rows;
        this.tipoRecorrido = builder.tipoRecorrido;
    }

    public static class Builder {
        private final int[][] arreglo;
        private int rows;
        private int cols;
        private int tipoRecorrido;

        public Builder(int[][] arreglo) {
            this.arreglo = arreglo;
        }

        public Builder cols(int cols) {
            this.cols = cols;
            return this;
        }

        public Builder rows(int rows) {
            this.rows = rows;
            return this;
        }

        public Builder tipoRecorrido(int tipoRecorrido) {
            this.tipoRecorrido = tipoRecorrido;
            return this;
        }

        public Recorrido build() {
            Recorrido recorrido = null;
            switch (tipoRecorrido) {
                case 1: recorrido = new RecorridoVertical(this);
                    break;
                case 2: recorrido = new RecorridoHorizontal(this);
                    break;
                case 3: recorrido = new RecorridoZ(this);
                    break;
                case 4: recorrido = new RecorridoN(this);
                    break;
            }
            return recorrido;
        }
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int[][] getArreglo() {
        return arreglo;
    }

    public void execute() {
        System.out.println("Mostrar resultado recorrido");
    }

    public void mostrarArreglo() {
        System.out.println("Matriz a Recorrer");
        for(int i = 0; i < this.getRows(); i += 1) {
            for(int j = 0; j < this.getCols(); j += 1) {
                System.out.print(this.getArreglo()[i][j]);
                if (this.getArreglo()[i][j] > 9) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}
