package Models;

import java.util.Objects;

public class Musica {
    private String titulo;
    private String artista;
    private String album;
    private String genero;

    public Musica(String titulo,String artista,String album,String genero){
        this.titulo = titulo;
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public String getAlbum() {
        return album;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString(){
        return "Titulo: " +titulo+ ", Artista: " +artista+ ", Album: " +album;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Musica musica = (Musica) obj;
        return titulo.equals(musica.titulo) && artista.equals(musica.artista);
    }

    @Override
    public int hashCode(){
        return Objects.hash(titulo) + Objects.hash(artista);
    }
}
