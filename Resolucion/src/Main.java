import Models.Almacenamiento;
import Excepciones.ElementoDuplicadoException;
import Excepciones.ElementoNoEncontradoException;
import Models.Documento;
import Models.Producto;
import Models.Usuario;

public class Main {
    public static void main(String[] args) {
        try {
            //Almacen documentos
            Almacenamiento<String, Documento> almacenDocumentos = new Almacenamiento<>();
            Documento doc1 = new Documento("Don quijote","Molinos y bigotes","Un tipazo");
            almacenDocumentos.agregar("doc1",doc1);

            //Almacen para productos
            Almacenamiento<String, Producto> almacenProductos = new Almacenamiento<>();
            Producto prod1 = new Producto("Mouse",97000,"Gamer");
            almacenProductos.agregar("prod1",prod1);

            Producto prod2 = new Producto("Teclado",9700,"Gamer");
            almacenProductos.agregar(String.valueOf(prod2.getNombre()),prod2);

            //Almacen para usuario
            Almacenamiento<String, Usuario> almacenUsuarios = new Almacenamiento<>();
            Usuario user1 = new Usuario("Kevin","kevillo@gmail.com","abc123");
            almacenUsuarios.agregar("user1",user1);

            //Mostrar elementos
            almacenDocumentos.mostrarElementos();
            almacenProductos.mostrarElementos();
            almacenUsuarios.mostrarElementos();

            //Obtener un producto
            almacenProductos.eliminar("prod1");
            almacenProductos.mostrarElementos();

        } catch (ElementoDuplicadoException | ElementoNoEncontradoException e) {
            System.out.println("Error: " +e.getMessage() );
        }
    }
}