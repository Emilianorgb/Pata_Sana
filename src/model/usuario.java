package model;

public class usuario {
    private int idUsuario;
    private String nombreUsuario;
    private String contraseña;

    public usuario() {
    }

    public usuario(int idUsuario, String nombreUsuario, String contraseña) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.contraseña = contraseña;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean iniciarSesion(String usuario, String contraseña) {
        return this.nombreUsuario.equals(usuario) && this.contraseña.equals(contraseña);
    }

    public void cerrarSesion() {
        System.out.println("Sesión cerrada.");
    }
}
