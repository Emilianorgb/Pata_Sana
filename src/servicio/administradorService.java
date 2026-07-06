package servicio;

import dao.administradorDAO;
import model.administrador;

import java.util.ArrayList;

public class administradorService {

    private administradorDAO dao;

    public administradorService() {
        dao = new administradorDAO();
    }

    public void guardar(administrador administrador) {
        dao.guardar(administrador);
    }

    public ArrayList<administrador> listar() {
        return dao.listar();
    }
}