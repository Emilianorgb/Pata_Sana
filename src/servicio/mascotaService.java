package servicio;

import dao.mascotaDAO;
import model.mascota;

import java.util.ArrayList;

public class mascotaService {

    private mascotaDAO dao;

    public mascotaService() {
        dao = new mascotaDAO();
    }

    public void guardar(mascota mascota) {
        dao.guardar(mascota);
    }

    public ArrayList<mascota> listar() {
        return dao.listar();
    }

    public mascota buscar(int id) {
        return dao.buscar(id);
    }

    public boolean eliminar(int id) {
        return dao.eliminar(id);
    }
}