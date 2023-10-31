package main.insertionSort;

public final class AlgoritmoInsertionSort {
    public static void sort(int[] vetor) {
        int aux, j;
        for(int i = 1; i < vetor.length; i++) {
            aux = vetor[i];
            // O j será a variável que vai conter os elementos que já estão no vetor, andando de trás para
            // a frente
            j = i-1;
            // Se o vetor de j for maior que o auxiliar, significa que precisamos passá-lo uma posição para a
            // frente
            while (j >= 0 && vetor[j] > aux) {
                // Nesse caso, a próxima posição do vetor vai receber o valor de j e depois, vamos decrementar
                // uma unidade
                vetor[j+1] = vetor[j];
                j--;
            }
            // Após movermos todos os elementos, precisamos mover o valor da variável auxiliar para aquela posição
            // que está vazia
            vetor[j+1] = aux;
        }
    }
}
