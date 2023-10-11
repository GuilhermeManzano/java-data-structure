package main.vetor;

import java.util.Arrays;

public class Vetor {
    private int[] elementos;
    private int tamanho;

    public Vetor(int capacidade) {
        this.elementos = new int[capacidade];
        this.tamanho = 0;
    }

    public void adiciona(int elemento) {
        this.aumentaCapacidade();

        if(this.tamanho < this.elementos.length) {
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
        }
    }

    public void aumentaCapacidade() {
        if(this.tamanho == this.elementos.length) {
            int[] elementosNovos = new int[this.elementos.length * 2];

            for (int i = 0; i < this.elementos.length; i++) {
                elementosNovos[i] = this.elementos[i];
            }

            this.elementos = elementosNovos;
        }
    }

    public int busca(int elementoBuscado) {
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] == elementoBuscado) {
                return i;
            }
        }

        throw new IllegalArgumentException("O número " + elementoBuscado + " não está no vetor.");
    }

    public void remove(int posicao) {
        if(!(posicao >= 0 && posicao < tamanho)) {
            throw new IllegalArgumentException("Posição inválida");
        }

        for(int i = posicao; i < this.tamanho - 1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--;
    }

    @Override
    public String toString() {
        return "Vetor: " + Arrays.toString(elementos);
    }
}
