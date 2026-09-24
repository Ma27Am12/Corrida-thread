package App;

import Modelo.Carro;

import java.util.ArrayList;
import java.util.List;

public class Corrida {
    private static final double distanciaTotal = 1000.0;
    private static final int numeroDeCarros = 22;

    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < numeroDeCarros; i++) {
            Carro carro = new Carro("Carro" + i, distanciaTotal);
            Thread thread = new Thread(carro);
            threads.add(thread);
        }

        System.out.println("Largada!");

        for(Thread t: threads) {
            t.start();
        }

        for (Thread t : threads) {
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Chegada!");
    }
}
