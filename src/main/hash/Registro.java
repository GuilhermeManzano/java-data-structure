package main.hash;

public class Registro {
    private int key;
    private String value;

    public Registro() { }

    public Registro(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return key % 100;
    }

    @Override
    public String toString() {
        return "Registro{" +
                "key=" + key +
                ", value='" + value + '\'' +
                '}';
    }
}
