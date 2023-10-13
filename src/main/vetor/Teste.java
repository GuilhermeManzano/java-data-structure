package main.vetor;

public class Teste {
    public static void main(String[] args) {
        int tamanho = 1_000_000_000;
        Vetor vetor = new Vetor(tamanho);

        for(int i=0; i<tamanho; i++) {
            vetor.adiciona(i);
        }

        long start = System.nanoTime();
        int buscarElemento = vetor.buscaLinear(500_000_000);
        long end = System.nanoTime();

        long duration = (end-start) / 1_000_000;
        System.out.println("Duration: " + duration + " ms");

        System.out.printf("O elemento buscado se encontra no índice: %d\n\n", buscarElemento);
    }
}