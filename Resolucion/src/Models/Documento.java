package Models;

public class Documento {
    private String titulo;
    private String contenido;
    private String autor;

    public Documento(String titulo,String contenido,String autor){
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
