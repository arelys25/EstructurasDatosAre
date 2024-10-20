// ARELY SINAI MUÑOZ TAPIA
// AXEL JOSUE HERNANDEZ ZAMBRANO
package colas;

public class Trabajo {

    private String titulo;
    private String autor;
    private int isbn;

    public Trabajo(String titulo, String autor, int isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public Trabajo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return "Trabajo{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn=" + isbn +
                '}';
    }
}