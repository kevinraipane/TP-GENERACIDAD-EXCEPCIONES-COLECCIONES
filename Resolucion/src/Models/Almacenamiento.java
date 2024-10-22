package Models;

import Excepciones.ElementoDuplicadoException;
import Excepciones.ElementoNoEncontradoException;

import java.util.HashMap;
import java.util.Map;

public class Almacenamiento<K,T> {
    private Map<K,T> almacen;

    public Almacenamiento(){
        almacen = new HashMap<>();
    }

    //Metodo para agregar un elemento
    public void agregar(K clave,T elemento)
        throws ElementoDuplicadoException{
        if(almacen.containsKey(clave)){
            throw new ElementoDuplicadoException("El elemento con clave '" +clave+ "' ya existe.");
        }
        almacen.put(clave, elemento);
    }

    //Metodo para obtener un elemento
    public T obtener(K clave)
            throws ElementoNoEncontradoException{
        if(!almacen.containsKey(clave)){
            throw new ElementoNoEncontradoException("El elemento con clave '" +clave+ "' no fue encontrado.");
        }
        return almacen.get(clave);
    }

    //Metodo para eliminar un elemento
    public void eliminar(K clave)
        throws ElementoNoEncontradoException{
        if(!almacen.containsKey(clave)){
            throw new ElementoNoEncontradoException("El elemento con clave '" +clave+ "' no fue encontrado.");
        }
        almacen.remove(clave);
    }

    //Metodo para mostrar elementos //Falta reescribir metodo toString en las clases
    public void mostrarElementos(){
        for(K clave : almacen.keySet()){
            T valor = almacen.get(clave);
            System.out.println("Clave: " +clave+ ", Elemento: " +valor);
        }
    }
}
