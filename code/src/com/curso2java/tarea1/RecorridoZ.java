package com.curso2java.tarea1;

public class RecorridoZ extends Recorrido {
    protected RecorridoZ(Builder builder) {
        super(builder);
    }

    @Override
    public void execute() {
        this.mostrarArreglo();
        this.recorrido();
    }

    private void recorrido() {
        System.out.print("Resultado del recorrido en Z: ");
        for(int j = 0; j < this.getRows();  j+=1) {
            if (j == 0 || j == (this.getRows() - 1)) {
                toRight(j);
            } else {
                toLeftZ(j);
            }
            System.out.print("");
        }

    }

    public void toLeftZ(int row) {
        System.out.print(this.getArreglo()[row][this.getCols() - row - 1] + " ");
    }

    public void toRight(int row) {
        for(int i = 0; i < this.getRows(); i += 1) {
            System.out.print(this.getArreglo()[row][i]  + " ");
        }
    }
}
