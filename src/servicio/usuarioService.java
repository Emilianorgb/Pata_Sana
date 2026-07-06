package servicio;

import dao.usuarioDAO;
import model.usuario;

import java.util.ArrayList;

public class usuarioService {

    private usuarioDAO dao;

    public usuarioService() {
        dao = new usuarioDAO();
    }

    public void guardar(usuario usuario) {
        dao.guardar(usuario);
    }

    public ArrayList<usuario> listar() {
        return dao.listar();
    }
}