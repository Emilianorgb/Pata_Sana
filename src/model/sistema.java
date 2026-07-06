package model;

public class sistema {
    private String nombreSistema;
    private String version;

    public sistema() {
    }

    public sistema(String nombreSistema, String version) {
        this.nombreSistema = nombreSistema;
        this.version = version;
    }

    public String getNombreSistema() {
        return nombreSistema;
    }

    public void setNombreSistema(String nombreSistema) {
        this.nombreSistema = nombreSistema;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void iniciarSistema() {
        System.out.println("Sistema iniciado.");
    }

    public void cerrarSistema() {
        System.out.println("Sistema finalizado.");
    }
}
