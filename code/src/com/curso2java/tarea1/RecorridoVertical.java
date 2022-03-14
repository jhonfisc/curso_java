package com.curso2java.tarea1;

public class RecorridoVertical extends Recorrido {
    protected RecorridoVertical(Builder builder) {
        super(builder);
    }

    @Override
    public void execute() {
        this.mostrarArreglo();
        this.recorrido();
    }

    private void recorrido() {
        System.out.print("Resultado del recorrido Vertical: ");
        boolean goDown = true;
        for(int j = 0; j < this.getCols();  j+=1) {
            if (goDown) {
                toDown(j);
            } else {
                toUp(j);
            }
            goDown = !goDown;
            System.out.print("");
        }
    }

    private void toDown(int col) {
        for(int i = 0; i < this.getArreglo()[col].length; i += 1) {
            System.out.print(this.getArreglo()[i][col]  + " ");
        }
    }

    private void toUp(int col) {
        for(int i = this.getArreglo()[col].length - 1; i >= 0; i -= 1) {
            System.out.print(this.getArreglo()[i][col] + " ");
        }
    }
}
