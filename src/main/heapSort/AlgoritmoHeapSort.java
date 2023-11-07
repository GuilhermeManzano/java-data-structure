package main.heapSort;

public final class AlgoritmoHeapSort {
    public static void sort(int[] vetor) {
        int n = vetor.length;

        // para montar a árvore, só precisamos percorrer até a metade do vetor.
        // por isso criamos um for que vai começar em 2n-1
        for(int i = n / 2 - 1; i >= 0; i--) {
            aplicarHeap(vetor, n, i);
        }

        // Após isso, os maiores elementos vão estar na raiz. Então, para finalizar o algoritmo de ordenação, precisamos
        // diminuir o tamanho do vetor em um a cada passada, e dentro dele, precisamos pegar o maior elemento e jogá-lo
        // para o final do vetor. Para fazer isso, sempre vamos pegar o primeiro elemento (do vetor 0) e jogá-lo para o
        // fim do vetor. Por fim, precisamos chamar o método aplicarHeap, passando o vetor, o índice j (tamanho do vetor)
        // e 0, no lugar do vetor i. Com isso, garantimos que sempre o maior elemento vai estar na posição 0 do vetor.
        for (int j = n - 1; j > 0; j--) {
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;

            aplicarHeap(vetor, j, 0);
        }
    }

    private static void aplicarHeap(int[] vetor, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        // logica para garantir que nao vamos pegar um elemento para fora do vetor e verificar se pre-
        // cisamos trocar as posicoes
        if (esquerda < n && vetor[esquerda] > vetor[raiz]) {
            raiz = esquerda;
            trocarElemento(vetor, i, raiz, n);
        }

        if (direita < n && vetor[direita] > vetor[raiz]) {
            raiz = direita;
            trocarElemento(vetor, i, raiz, n);
        }
    }

    private static void trocarElemento(int[] vetor, int i, int raiz, int n) {
        int aux = vetor[i];
        vetor[i] = vetor[raiz];
        vetor[raiz] = aux;

        // Como é uma estrutura de árvore, precisamos alterar os demais elementos de forma recursiva.
        // Para isso, basta chamar o próprio metodo aplicarHeap, passando a raiz no lugar do i.
        aplicarHeap(vetor, n, raiz);
    }
}
