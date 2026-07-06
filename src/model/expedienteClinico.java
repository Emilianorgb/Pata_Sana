package model;

import java.time.LocalDate;

public class expedienteClinico {
    // Atributos
    private int idExpediente;
    private LocalDate fechaApertura;
    private String alergias;
    private String antecedentes;
    private String observaciones;

    // Constructor vacío
    public expedienteClinico() {
    }

    // Constructor con parámetros
    public expedienteClinico(int idExpediente,
                             LocalDate fechaApertura,
                             String alergias,
                             String antecedentes,
                             String observaciones) {

        this.idExpediente = idExpediente;
        this.fechaApertura = fechaApertura;
        this.alergias = alergias;
        this.antecedentes = antecedentes;
        this.observaciones = observaciones;
    }

    // Getters y Setters

    public int getIdExpediente() {
        return idExpediente;
    }

    public void setIdExpediente(int idExpediente) {
        this.idExpediente = idExpediente;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getAntecedentes() {
        return antecedentes;
    }

    public void setAntecedentes(String antecedentes) {
        this.antecedentes = antecedentes;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    // Métodos

    public void abrirExpediente() {
        System.out.println("Expediente clínico abierto.");
    }

    public void actualizarExpediente() {
        System.out.println("Expediente clínico actualizado.");
    }
}
