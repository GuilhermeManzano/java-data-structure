package main.mergeSort;

public final class AlgoritmoMergeSort {
    public static void sort(int[] vetor, int[] vetorAux, int esquerda, int direita) {
        if (esquerda < direita) {
            int meio = (esquerda + direita) / 2;
            sort(vetor, vetorAux, esquerda, meio);
            sort(vetor, vetorAux, meio + 1, direita);
            particao(vetor, vetorAux, esquerda, meio, direita);
        }
    }

    private static void particao(int[] vetor, int[] vetorAux, int esquerda, int meio, int direita) {
        for (int i = esquerda; i <= direita; i++) {
            vetorAux[i] = vetor[i];
        }

        int j = meio + 1;
        for (int k = esquerda; k <= direita; k++) {
            if (esquerda > meio) {
                vetor[k] = vetorAux[j++];
            } else if (j > direita) {
                vetor[k] = vetorAux[esquerda++];
            } else if (vetorAux[esquerda] < vetorAux[j]) {
                vetor[k] = vetorAux[esquerda++];
            } else {
                vetor[k] = vetorAux[j++];
            }
        }
    }
}
