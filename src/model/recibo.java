package model;

import java.time.LocalDate;

public class recibo {
    private int idRecibo;
    private LocalDate fecha;
    private double monto;

    public recibo() {
    }

    public recibo(int idRecibo, LocalDate fecha, double monto) {
        this.idRecibo = idRecibo;
        this.fecha = fecha;
        this.monto = monto;
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void imprimir() {
        System.out.println("Recibo impreso.");
    }

}
