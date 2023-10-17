package main.pilha;

public class Teste {
    public static void main(String[] args) {
        Pilha pilha = new Pilha(10);

        for(int i = 1; i <= pilha.elementos.length; i++) {
            pilha.push(i);
        }

        System.out.println("Pilha: " + pilha);

        while(!pilha.isEmpty()) {
            int elemento = pilha.pop();
            System.out.println("Elemento removido: " + elemento + ". Pilha Atual: "+ pilha);
        }
    }
}
