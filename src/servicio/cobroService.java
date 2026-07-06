package servicio;

import dao.cobroDAO;
import model.cobro;

import java.util.ArrayList;

public class cobroService {

    private cobroDAO dao;

    public cobroService() {
        dao = new cobroDAO();
    }

    public void guardar(cobro cobro) {
        dao.guardar(cobro);
    }

    public ArrayList<cobro> listar() {
        return dao.listar();
    }
}