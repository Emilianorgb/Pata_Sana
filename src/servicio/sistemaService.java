package servicio;

import dao.sistemaDAO;
import model.sistema;

import java.util.ArrayList;

public class sistemaService {

    private sistemaDAO dao;

    public sistemaService() {
        dao = new sistemaDAO();
    }

    public void guardar(sistema sistema) {
        dao.guardar(sistema);
    }

    public ArrayList<sistema> listar() {
        return dao.listar();
    }

    public sistema buscar(String nombre) {
        return dao.buscar(nombre);
    }

    public boolean eliminar(String nombre) {
        return dao.eliminar(nombre);
    }
}