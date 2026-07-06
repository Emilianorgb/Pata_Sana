package servicio;

import dao.expedienteClinicoDAO;
import model.expedienteClinico;

import java.util.ArrayList;

public class expedienteClinicoService {

    private expedienteClinicoDAO dao;

    public expedienteClinicoService() {
        dao = new expedienteClinicoDAO();
    }

    public void guardar(expedienteClinico expediente) {
        dao.guardar(expediente);
    }

    public ArrayList<expedienteClinico> listar() {
        return dao.listar();
    }

    public expedienteClinico buscar(int id) {
        return dao.buscar(id);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }
}