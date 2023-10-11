package main.vetor;

public class Teste {
    public static void main(String[] args) {
        int tamanho = 100;
        Vetor vetor = new Vetor(tamanho);

        for(int i=0; i<tamanho; i++) {
            vetor.adiciona(i);
        }

        long start = System.nanoTime();
        vetor.remove(3);
        long end = System.nanoTime();

        long duration = (end-start) / 1_000_000;
        System.out.println("Duration: " + duration + " ms");

        System.out.println("Vetor atual: " + vetor);
    }
}
