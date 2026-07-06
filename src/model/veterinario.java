package model;

public class veterinario {

    private String especialidad;

    public veterinario() {
    }

    public veterinario(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void registrarConsulta() {
        System.out.println("Consulta registrada.");
    }

    public void registrarVacuna() {
        System.out.println("Vacuna registrada.");
    }
}