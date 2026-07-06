package servicio;

import dao.propietarioDAO;
import model.propietario;

import java.util.ArrayList;

public class propietarioService {

    private propietarioDAO dao;

    public propietarioService() {
        dao = new propietarioDAO();
    }

    public void guardar(propietario propietario) {
        dao.guardar(propietario);
    }

    public ArrayList<propietario> listar() {
        return dao.listar();
    }

    public propietario buscar(int id) {
        return dao.buscar(id);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }
}