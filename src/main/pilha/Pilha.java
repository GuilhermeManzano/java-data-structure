package main.pilha;

import java.util.Arrays;

public class Pilha {

    int elementos[];

    // indice que indica em qual posicao de vetor nos temos o ultimo elemento armazenado
    int topo;

    public Pilha(int tamanho) {
        elementos = new int[tamanho];
        topo = -1; //posicao invalida do vetor
    }

    public void push(int elemento) {
        if(isFull()) throw new RuntimeException("Stack Overflow!"); //tradução: pilha cheia
        topo++;
        elementos[topo] = elemento;
    }

    public int pop() {
        if(isEmpty()) throw new RuntimeException("Empty Stack"); //tradução: pilha vazia
        int elementoRemovido = elementos[topo];
        elementos[topo] = 0;
        topo--;
        return elementoRemovido;
    }

    public boolean isEmpty() {
        return topo == -1; // Indica que a pilha está vazia
    }

    public boolean isFull() {
        return topo == elementos.length - 1;
    }

    public int top() {
        if(isEmpty()) throw new RuntimeException("Empty Stack"); //tradução: pilha vazia
        return elementos[topo];
    }

    @Override
    public String toString() {
        return Arrays.toString(elementos);
    }
}
