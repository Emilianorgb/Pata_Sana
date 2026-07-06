package servicio;

import dao.descuentoDAO;
import model.descuento;

import java.util.ArrayList;

public class descuentoService {

    private descuentoDAO dao;

    public descuentoService() {
        dao = new descuentoDAO();
    }

    public void guardar(descuento descuento) {
        dao.guardar(descuento);
    }

    public ArrayList<descuento> listar() {
        return dao.listar();
    }

    public descuento buscar(int id) {
        return dao.buscar(id);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }
}