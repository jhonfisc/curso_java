package hilos;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite el hilo a finalizar (1-4): ");
        int numeroHilo = scanner.nextInt();
        Random random = new Random(3000);
        Map<Number, Thread> hilos = new HashMap<>();
        for(int i = 1; i <= 4; i += 1) {
            Thread hilo = new Thread(new Hilo(String.valueOf(i), random.nextInt(1000)));
            hilo.start();
            hilos.put(i,hilo);
        }
        hilos.get(numeroHilo).interrupt();
    }
}
