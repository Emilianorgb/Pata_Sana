package model;

public class cobro {
    private int idCobro;
    private double subtotal;
    private double descuento;
    private double total;
    private String metodoPago;

    public cobro() {
    }

    public cobro(int idCobro, double subtotal, double descuento, double total, String metodoPago) {
        this.idCobro = idCobro;
        this.subtotal = subtotal;
        this.descuento = descuento;
        this.total = total;
        this.metodoPago = metodoPago;
    }

    public int getIdCobro() {
        return idCobro;
    }

    public void setIdCobro(int idCobro) {
        this.idCobro = idCobro;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double calcularTotal() {
        total = subtotal - descuento;
        return total;
    }

    public void generarCobro() {
        System.out.println("Cobro generado.");
    }
}
