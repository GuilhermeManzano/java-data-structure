package main.quickSort;

import static main.quickSort.AlgoritmoQuickSort.sort;

public class Teste {
    public static void main(String[] args) {
        int[] vetor = new int[100_000];

        for (int i = 0; i < vetor.length ; i++) {
            vetor[i] = (int) (Math.random() * vetor.length);
        }

        long start = System.nanoTime();
        sort(vetor, 0, vetor.length - 1);
        long end = System.nanoTime();

        long duration = (end-start) / 1_000_000;
        System.out.println("Duration: " + duration + " ms");
    }
}
