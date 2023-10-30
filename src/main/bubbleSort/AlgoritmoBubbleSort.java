package main.bubbleSort;

public final class AlgoritmoBubbleSort {
    public static void sort(int[] vetor) {
        int aux;
        for(int i = 0; i < vetor.length; i++) {
            for(int j = i + 1; j < vetor.length - 1; j++) {
                if(vetor[i] > vetor[j]) {
                    aux = vetor[j];
                    vetor[j] = vetor[i];
                    vetor[i] = aux;
                }
            }
        }
    }
}
