package main.hash;

public class Teste {
    public static void main(String[] args) {
        MapaHash mapa = new MapaHash();

        mapa.put(new Registro(5346, "Guilherme"));
        mapa.put(new Registro(423, "João"));
        mapa.put(new Registro(1235, "Marcelo"));
        mapa.put(new Registro(8819, "Beatriz"));

        System.out.println("Registro " + mapa.get(423));
    }
}
