package main.vetor;

public class BuscaLinear {
    public static void main(String[] args) {
        int tamanho = 10;
        Vetor vetor = new Vetor(tamanho);

        vetor.adiciona(3);
        vetor.adiciona(7);
        vetor.adiciona(45);
        vetor.adiciona(99);
        vetor.adiciona(12);
        vetor.adiciona(0);
        vetor.adiciona(98);
        vetor.adiciona(3);
        vetor.adiciona(56);
        vetor.adiciona(30);

        System.out.println(vetor);

        int primeiroElemento = 45;
        int buscarElemento = vetor.buscaLinear(primeiroElemento);
        System.out.printf("Buscando o elemento %d...\n", primeiroElemento);
        System.out.printf("O elemento buscado se encontra no índice: %d\n\n", buscarElemento);

        int segundoElemento = 4;
        buscarElemento = vetor.buscaLinear(segundoElemento);
        System.out.printf("Buscando o elemento %d...\n", segundoElemento);
        System.out.printf("O elemento buscado se encontra no índice: %d\n\n", buscarElemento);
    }
}
