package main.listaEncadeada;

public class ListaEncadeada<T> {
    private No<T> inicio;
    private No<T> ultimo;
    private int tamanho;

    public void adiciona(T elemento) {
        No<T> celula = new No<>(elemento);
        if (this.tamanho == 0) {
            this.inicio = celula;
        } else {
            this.ultimo.setProximo(celula);
        }
        this.ultimo = celula;
        this.tamanho++;
    }

    public int getTamanho() {
        return this.tamanho;
    }

    public int buscar(T elemento) {
        No<T> atual = this.inicio;
        for(int i=0; i < this.getTamanho(); i++) {
            if(elemento == atual.getElemento()) {
                return i;
            }
            atual = atual.getProximo();
        }
        throw new RuntimeException("Elemento não encontrado");
    }

    public void remover(T elemento) {
        No<T> anterior = null;
        No<T> atual = this.inicio;

        for(int i=0; i < this.getTamanho(); i++){
            if (atual.getElemento() == elemento){
                if (this.tamanho == 1){
                    this.inicio = null;
                    this.ultimo = null;
                } else if (atual == inicio){
                    this.inicio = atual.getProximo();
                    atual.setProximo(null);
                } else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                } else if (anterior != null){
                    anterior.setProximo(atual.getProximo());
                }
                this.tamanho--;
                break;
            }

            anterior = atual;
            atual = atual.getProximo();
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Lista Encadeada = [");

        No<T> atual = this.inicio;
        for(int i =0 ; i < this.tamanho - 1; i++) {
            builder.append(atual.getElemento()).append(",");
            atual = atual.getProximo();
        }
        builder.append(atual.getElemento()).append("]");

        return builder.toString();
    }
}
