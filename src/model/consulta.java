package model;

import java.time.LocalDate;

public class consulta {
    private int idConsulta;
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
    private double costo;

    public consulta() {
    }

    public consulta(int idConsulta, LocalDate fecha, String diagnostico,
                    String tratamiento, String observaciones, double costo) {
        this.idConsulta = idConsulta;
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
        this.costo = costo;
    }

    public int getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(int idConsulta) {
        this.idConsulta = idConsulta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public void registrar() {
        System.out.println("Consulta registrada.");
    }

    public void editar() {
        System.out.println("Consulta actualizada.");
    }
}
