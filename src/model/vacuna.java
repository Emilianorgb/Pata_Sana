package model;

import java.time.LocalDate;

public class vacuna {
    private int idVacuna;
    private String tipo;
    private LocalDate fechaAplicacion;
    private String numeroLote;
    private LocalDate proximaAplicacion;

    public vacuna() {
    }

    public vacuna(int idVacuna, String tipo, LocalDate fechaAplicacion,
                  String numeroLote, LocalDate proximaAplicacion) {
        this.idVacuna = idVacuna;
        this.tipo = tipo;
        this.fechaAplicacion = fechaAplicacion;
        this.numeroLote = numeroLote;
        this.proximaAplicacion = proximaAplicacion;
    }

    public int getIdVacuna() {
        return idVacuna;
    }

    public void setIdVacuna(int idVacuna) {
        this.idVacuna = idVacuna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public LocalDate getProximaAplicacion() {
        return proximaAplicacion;
    }

    public void setProximaAplicacion(LocalDate proximaAplicacion) {
        this.proximaAplicacion = proximaAplicacion;
    }

    public void registrar() {
        System.out.println("Vacuna registrada.");
    }

    public void programarRecordatorio() {
        System.out.println("Recordatorio programado.");
    }

}
