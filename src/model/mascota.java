package model;

import java.time.LocalDate;
import java.time.Period;

public class mascota {

    // Atributos
    private int idMascota;
    private String nombre;
    private String especie;
    private String raza;
    private String sexo;
    private LocalDate fechaNacimiento;
    private double peso;
    private String color;

    // Constructor vacío
    public mascota() {
    }

    // Constructor con parámetros
    public mascota(int idMascota, String nombre, String especie,
                   String raza, String sexo,
                   LocalDate fechaNacimiento,
                   double peso, String color) {

        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.raza = raza;
        this.sexo = sexo;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.color = color;
    }

    // Getters y Setters

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Métodos

    public int calcularEdad() {

        if (fechaNacimiento == null) {
            return 0;
        }

        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public void actualizarDatos() {
        System.out.println("Datos de la mascota actualizados.");
    }

}
