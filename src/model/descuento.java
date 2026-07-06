package model;

public class descuento {

    private int idDescuento;
    private String tipo;
    private double porcentaje;

    public descuento() {
    }

    public descuento(int idDescuento, String tipo, double porcentaje) {
        this.idDescuento = idDescuento;
        this.tipo = tipo;
        this.porcentaje = porcentaje;
    }

    public int getIdDescuento() {
        return idDescuento;
    }

    public void setIdDescuento(int idDescuento) {
        this.idDescuento = idDescuento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public double aplicarDescuento(double monto) {
        return monto - (monto * porcentaje / 100);
    }
}
