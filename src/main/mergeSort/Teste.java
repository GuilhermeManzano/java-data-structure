package main.mergeSort;

import java.util.Arrays;

import static main.mergeSort.AlgoritmoMergeSort.sort;

public class Teste {
    public static void main(String[] args) {
        int[] vetor = new int[10];
        int[] vetorAux = new int[10];

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        System.out.println("Vetor desordenado: " + Arrays.toString(vetor));

        sort(vetor, vetorAux,0, vetor.length - 1);

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}
