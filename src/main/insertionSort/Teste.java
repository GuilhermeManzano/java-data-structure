package main.insertionSort;

import java.util.Arrays;

import static main.insertionSort.AlgoritmoInsertionSort.sort;

public class Teste {
    public static void main(String[] args) {
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }
        System.out.println("Vetor desordenado: " + Arrays.toString(vetor));

        long start = System.nanoTime();
        sort(vetor);
        long end = System.nanoTime();

        long duration = (end-start) / 1_000_000;
        System.out.println("Duration: " + duration + " ms");

        System.out.println("Vetor ordenado: " + Arrays.toString(vetor));
    }
}
