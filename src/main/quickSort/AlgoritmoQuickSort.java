package main.quickSort;

public final class AlgoritmoQuickSort {
    public static void sort(int[] vetor, int esquerda, int direita) {
        if (esquerda < direita) {
            int pivo = particao(vetor, esquerda, direita);
            sort(vetor, esquerda, pivo);
            sort(vetor, pivo + 1, direita);
        }
    }

    private static int particao(int[] vetor, int esquerda, int direita) {
        int meio = (esquerda + direita) / 2;
        int pivo = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while (true) {
            do {
                i++;
            } while (vetor[i] < pivo);
            do {
                j--;
            } while (vetor[j] > pivo);

            if (i >= j) {
                return j;
            }

            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}
