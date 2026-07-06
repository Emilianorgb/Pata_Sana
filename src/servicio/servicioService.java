package servicio;

import dao.servicioDAO;
import model.servicio;

import java.util.ArrayList;

public class servicioService {

    private servicioDAO dao;

    public servicioService() {
        dao = new servicioDAO();
    }

    public void guardar(servicio servicio) {
        dao.guardar(servicio);
    }

    public ArrayList<servicio> listar() {
        return dao.listar();
    }
}