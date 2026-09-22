package Modelo;

public class Carro implements Runnable{
    private String nome;
    private Double distanciaTotalCorrida;
    private Double distanciaTotalPercorrida;

    public Carro (String nome, Double distanciaTotalCorrida, Double distanciaTotalPercorrida) {
        this.nome = nome;
        this.distanciaTotalCorrida = distanciaTotalCorrida;
        this.distanciaTotalPercorrida = 0.0;
    }

    public void run() {

    }
}
