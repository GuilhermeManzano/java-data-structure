package main.fila;

public class Teste {
    public static void main(String[] args) {
        Fila fila = new Fila(10);

        for(int i = 1; i <= fila.elementos.length; i++) {
            fila.push(i);
        }

        System.out.println("Fila: " + fila);

        while(!fila.isEmpty()) {
            int elemento = fila.pop();
            System.out.println("Elemento removido: " + elemento + ". Fila Atual: "+ fila);
        }
    }
}
