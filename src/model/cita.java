package model;

import java.time.LocalDate;

public class cita {
    private int idCita;
    private LocalDate fecha;
    private String hora;
    private String motivo;
    private String estado;

    public cita() {
    }

    public cita(int idCita, LocalDate fecha, String hora, String motivo, String estado) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.estado = estado;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void agendar() {
        System.out.println("Cita agendada.");
    }

    public void cancelar() {
        System.out.println("Cita cancelada.");
    }

    public void reprogramar() {
        System.out.println("Cita reprogramada.");
    }
}
