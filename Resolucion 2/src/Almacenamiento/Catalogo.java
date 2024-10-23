package Almacenamiento;

import Excepciones.ElementoDuplicadoException;
import Excepciones.ElementoNoEncontradoException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Catalogo <T,S>{
    private Collection<T> catalogo;

    public Catalogo(int opcion){
        if(opcion == 1){
            catalogo = new ArrayList<>();
        }else if(opcion == 2){
            catalogo = new HashSet<>();
        }else{
            System.out.println("Opcion invalida.");
        }
    }

    //Metodo para agregar un elemento
    public void agregar(T elemento)
            throws ElementoDuplicadoException{
        if(catalogo.contains(elemento)){
            throw new ElementoDuplicadoException("El elemento ya existe en la coleccion.");
        }
        catalogo.add(elemento);
    }

    //Metodo para obtener un elemento
    public T obtener(S atributo)
            throws ElementoNoEncontradoException{
            for(T elemento : catalogo){
                if(elemen)
            }
    }
}
