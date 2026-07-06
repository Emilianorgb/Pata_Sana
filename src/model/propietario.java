package model;

public class propietario {

    // Atributos
    private int idPropietario;
    private String nombreCompleto;
    private String telefono;
    private String correo;
    private String direccion;

    // Constructor vacío
    public propietario() {
    }

    // Constructor con parámetros
    public propietario(int idPropietario, String nombreCompleto, String telefono,
                       String correo, String direccion) {
        this.idPropietario = idPropietario;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
    }

    // Getters y Setters

    public int getIdPropietario() {
        return idPropietario;
    }

    public void setIdPropietario(int idPropietario) {
        this.idPropietario = idPropietario;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    // Métodos

    public void registrar() {
        System.out.println("Propietario registrado correctamente.");
    }

    public void actualizarDatos() {
        System.out.println("Datos del propietario actualizados.");
    }

    public void consultarMascotas() {
        System.out.println("Consultando mascotas del propietario...");
    }
}
