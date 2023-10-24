package main.listaEncadeada;

public class ListaEncadeadaTeste {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        for(int i = 1; i <= 10; i++) {
            lista.adiciona(i);
        }

        System.out.println(lista);

        int buscar = lista.buscar(10);
        System.out.println("O elemento 10 se encontra no índice " + buscar);

        lista.remover(4);
        System.out.println(lista);
    }
}
