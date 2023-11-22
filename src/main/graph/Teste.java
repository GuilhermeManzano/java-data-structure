package main.graph;

public class Teste {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();

        grafo.adicionarVertice("João");
        grafo.adicionarVertice("Guilherme");
        grafo.adicionarVertice("Marcelo");
        grafo.adicionarVertice("Alan");
        grafo.adicionarVertice("Daniel");

        grafo.adicionarAresta(2.0, "João", "Guilherme");
        grafo.adicionarAresta(3.0, "Guilherme", "Alan");
        grafo.adicionarAresta(1.0, "Alan", "Marcelo");
        grafo.adicionarAresta(1.0, "João", "Alan");
        grafo.adicionarAresta(2.0, "Daniel", "Guilherme");
        grafo.adicionarAresta(3.0, "Daniel", "João");

        grafo.buscaEmLargura();
    }
}
