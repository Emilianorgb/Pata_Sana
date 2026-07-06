package servicio;

import dao.citaDAO;
import model.cita;

import java.util.ArrayList;

public class citaService {

    private citaDAO dao;

    public citaService() {
        dao = new citaDAO();
    }

    public void guardar(cita cita) {
        dao.guardar(cita);
    }

    public ArrayList<cita> listar() {
        return dao.listar();
    }
}