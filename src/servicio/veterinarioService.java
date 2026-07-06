package servicio;

import dao.veterinarioDAO;
import model.veterinario;
import java.util.ArrayList;

public class veterinarioService {

    private veterinarioDAO dao;

    public veterinarioService() {
        dao = new veterinarioDAO();
    }

    public void guardar(veterinario veterinario) {
        dao.guardar(veterinario);
    }

    public ArrayList<veterinario> listar() {
        return dao.listar();
    }
}