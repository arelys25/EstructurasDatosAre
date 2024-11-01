package listaCircularGeneric;

import java.util.Objects;

public class Articulo {
    private String titulo;
    private  String autor;
    private  int numero;

    public Articulo() {
    }

    public Articulo(String titulo, String autor, int numero) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero = numero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
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
        Articulo articulo = (Articulo) o;
        return numero == articulo.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Articulo{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero=" + numero +
                '}';
    }
}
