package Models;

public class Usuario {
    private String nombreUsuario;
    private String email;
    private String contraseña;

    public Usuario(String nombreUsuario,String email,String contraseña){
        this.nombreUsuario = nombreUsuario;
        this.email = email;
        this.contraseña = contraseña;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
