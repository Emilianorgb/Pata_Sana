package servicio;

import dao.reciboDAO;
import model.recibo;

import java.util.ArrayList;

public class reciboService {

    private reciboDAO dao;

    public reciboService() {
        dao = new reciboDAO();
    }

    public void guardar(recibo recibo) {
        dao.guardar(recibo);
    }

    public ArrayList<recibo> listar() {
        return dao.listar();
    }

    public recibo buscar(int id) {
        return dao.buscar(id);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }
}