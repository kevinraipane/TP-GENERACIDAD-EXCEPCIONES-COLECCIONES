package Models;

import java.time.Duration;
import java.util.Objects;

public class Pelicula {
    //Atributos
    private String titulo;
    private String director;
    private Duration duracion;
    private int anioLanzamiento;

    //Constructor
    public Pelicula(String titulo,String director,Duration duracion,int anioLanzamiento){
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
        this.anioLanzamiento = anioLanzamiento;
    }

    //Getters y Setters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public Duration getDuracion() {
        return duracion;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setDuracion(Duration duracion) {
        this.duracion = duracion;
    }

    public void setAnioLanzamiento(int anioLanzamiento) {
        this.anioLanzamiento = anioLanzamiento;
    }

    @Override
    public String toString(){
        return "Titulo: " +titulo+ ", Director: " +director+ ", Duracion: " +duracion;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Pelicula pelicula = (Pelicula) obj;
        return titulo.equals(pelicula.titulo);
    }

    @Override
    public int hashCode(){
        return Objects.hash(titulo);
    }
}
