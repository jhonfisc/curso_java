package com.curso2java.tarea1;

public class RecorridoN extends Recorrido {
    protected RecorridoN(Builder builder) {
        super(builder);
    }

    @Override
    public void execute() {
        this.mostrarArreglo();
        this.recorrido();
    }

    private void recorrido() {
        System.out.print("Resultado del recorrido en N: ");
        for(int j = 0; j < this.getCols();  j+=1) {
            if (j == 0 || j == (this.getCols() - 1)) {
                toUp(j);
            } else {
                toDown(j);
            }
            System.out.print("");
        }

    }

    public void toDown(int col) {
        System.out.print(this.getArreglo()[col][col] + " ");
    }

    public void toUp(int col) {
        for(int i = this.getRows() - 1; i >= 0; i -= 1) {
            System.out.print(this.getArreglo()[i][col]  + " ");
        }
    }
}
