package listaCircularGeneric;

import java.util.Objects;

public class Revista {
    private int serie;
    private String editorial;
    private int numero;

    public Revista() {
    }

    public Revista(int serie, String editorial, int numero) {
        this.serie = serie;
        this.editorial = editorial;
        this.numero = numero;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Revista revista = (Revista) o;
        return serie == revista.serie;
    }

    @Override
    public int hashCode() {
        return Objects.hash(serie);
    }

    @Override
    public String toString() {
        return "Revista{" +
                "serie=" + serie +
                ", editorial='" + editorial + '\'' +
                ", numero=" + numero +
                '}';
    }
}
