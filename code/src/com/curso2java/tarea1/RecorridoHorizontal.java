package com.curso2java.tarea1;

public class RecorridoHorizontal extends Recorrido {
    protected RecorridoHorizontal(Builder builder) {
        super(builder);
    }

    @Override
    public void execute() {
        this.mostrarArreglo();
        this.recorrido();
    }

    private void recorrido() {
        System.out.print("Resultado del recorrido Horizontal: ");
        boolean goRight = true;
        for(int j = 0; j < this.getRows();  j+=1) {
            if (goRight) {
                toRight(j);
            } else {
                toLeft(j);
            }
            goRight = !goRight;
            System.out.print("");
        }
    }

    private void toRight(int row) {
        for(int i = 0; i < this.getCols(); i += 1) {
            System.out.print(this.getArreglo()[row][i]  + " ");
        }
    }

    private void toLeft(int row) {
        for(int i = this.getCols() - 1; i >= 0; i -= 1) {
            System.out.print(this.getArreglo()[row][i] + " ");
        }
    }
}
