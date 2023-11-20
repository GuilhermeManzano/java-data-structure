package main.hash;

import java.util.Arrays;

public class MapaHash {
    private Registro valores[];

    public MapaHash() {
        valores = new Registro[100];
    }

    public void put(Registro registro) {
        int posicao = registro.hashCode();
        if(valores[posicao] == null) {
            valores[posicao] = registro;
        }
    }

    public Registro get(int key) {
        Registro r = new Registro();
        r.setKey(key);
        int posicao = r.hashCode();
        return valores[posicao];
    }

    @Override
    public String toString() {
        return Arrays.toString(valores);
    }
}
