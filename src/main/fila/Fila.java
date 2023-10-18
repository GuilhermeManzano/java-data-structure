package main.fila;

import java.util.Arrays;

public class Fila {
    int elementos[];
    int primeiro;
    int ultimo;
    int total;

    public Fila(int tamanho) {
        elementos = new int[tamanho];
        primeiro = 0;
        ultimo = 0;
        total = 0;
    }

    public void push(int elemento) {
        if(isFull()) throw new RuntimeException("Queue full!");
        elementos[ultimo] = elemento;
        // logica necessaria pois o ultimo elemento será o tamanho do vetor -1
        ultimo = (ultimo + 1) % elementos.length;
        total++;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("Empty queue");
        int elementoRemovido = elementos[primeiro];
        elementos[primeiro] = 0;
        primeiro = (primeiro + 1) % elementos.length;
        total--;
        return elementoRemovido;
    }

    public boolean isEmpty() {
        return total == 0;
    }

    public boolean isFull() {
        return total == elementos.length ;
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
