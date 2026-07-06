package servicio;

import dao.recepcionistaDAO;
import model.recepcionista;

import java.util.ArrayList;

public class recepcionistaService {

    private recepcionistaDAO dao;

    public recepcionistaService() {
        dao = new recepcionistaDAO();
    }

    public void guardar(recepcionista recepcionista) {
        dao.guardar(recepcionista);
    }

    public ArrayList<recepcionista> listar() {
        return dao.listar();
    }
}