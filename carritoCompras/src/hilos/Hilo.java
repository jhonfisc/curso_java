package hilos;

public class Hilo implements Runnable{

    private String name;
    private long inicio;
    private long time;
    private Boolean parar = false;

    public Hilo(String name, long time) {
        this.name = name;
        this.time = Math.abs(time);
    }

    @Override
    public void run() {
        inicio();
        System.out.println("Ejecutando el hilo " + name);
        try {
            Thread.sleep(time);
            fin();
            duracion();
        } catch (InterruptedException e) {
            System.out.println("===> Finalizado hilo " + name);
        }
    }

    public void inicio() {
        System.out.println("He iniciado la ejecucion del hilo " + name);
        inicio = System.currentTimeMillis();
    }

    public void fin() {
        System.out.print("He finalizado la ejecucion del hilo " + name + ". ");
    }

    public void duracion() {
        long fin = System.currentTimeMillis();
        double tiempo = fin - inicio;
        System.out.println("Duracion hilo " + name + " : "+tiempo +" milisegundos");
    }
}
