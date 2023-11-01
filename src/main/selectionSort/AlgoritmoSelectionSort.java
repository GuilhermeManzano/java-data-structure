package main.selectionSort;

public final class AlgoritmoSelectionSort {
    public static void sort(int[] vetor) {
        int aux, posicao_menor;
        for(int i=0; i < vetor.length; i++) {
            posicao_menor = i;
            for(int j=i+1; j < vetor.length; j++) {
                if(vetor[j] < vetor[posicao_menor]) {
                    posicao_menor = j;
                }
            }
            aux = vetor[posicao_menor];
            vetor[posicao_menor] = vetor[i];
            vetor[i] = aux;
        }
    }
}
