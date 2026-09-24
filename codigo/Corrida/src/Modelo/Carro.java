package Modelo;

public class Carro implements Runnable{
    private String nome;
    private Double distanciaTotalCorrida;
    private Double distanciaPercorrida;

    public Carro (String nome, Double distanciaTotalCorrida) {
        this.nome = nome;
        this.distanciaTotalCorrida = distanciaTotalCorrida;
        this.distanciaPercorrida = 0.0;
    }

    @Override
    public void run() {
        while (distanciaPercorrida < distanciaTotalCorrida) {
            double incremento = 10 + Math.random() * 40;
            distanciaPercorrida += incremento;

            if(distanciaPercorrida > distanciaPercorrida) {
                distanciaPercorrida = distanciaTotalCorrida;
            }

            System.out.println(nome + " andou " + String.format("%.2f", incremento) +
                    " metros e já percorreu " + String.format("%.2f", distanciaPercorrida) +
                    " de " + distanciaTotalCorrida + "metros"
            );

            try {
                long pausa = 100 + (long)(Math.random() * 400);
                Thread.sleep(pausa);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(nome + " cruzou a linha de chegada!");
    }
}
