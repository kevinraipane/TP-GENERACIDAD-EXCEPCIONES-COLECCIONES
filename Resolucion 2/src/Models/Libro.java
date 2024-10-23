package Models;

import java.util.Objects;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String isbn;
    private int numeroPaginas;

    //Constructor
    public Libro(String titulo,String autor,String isbn,int numeroPaginas){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.numeroPaginas = numeroPaginas;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public String toString(){
        return "Titulo: " +titulo+ ", Autor: " +autor+ ", ISBM: " +isbn+ ", Numero de paginas: " +numeroPaginas;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Libro libro = (Libro) obj;
        return titulo.equals(libro.titulo) && autor.equals(libro.autor);
    }

    @Override
    public int hashCode(){
        return Objects.hash(titulo) + Objects.hash(autor);
    }
}
