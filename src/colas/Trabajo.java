package colas;
import java.util.Objects;

public class Trabajo {

    private String titulo;
    private String autor;
    private String isbn;

    public Trabajo(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
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

    public String isImpreso() {
        return isbn;
    }

    public void setImpreso(String impreso) {
        this.isbn = impreso;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", codigo del libro=" + isbn +
                '}';
    }
}