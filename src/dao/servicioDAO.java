package dao;

import model.servicio;
import java.util.ArrayList;

public class servicioDAO {

    private ArrayList<servicio> servicios;

    public servicioDAO() {
        servicios = new ArrayList<>();
    }

    public void guardar(servicio servicio) {
        servicios.add(servicio);
    }

    public ArrayList<servicio> listar() {
        return servicios;
    }

}