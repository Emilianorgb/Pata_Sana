package dao;

import model.usuario;
import java.util.ArrayList;

public class usuarioDAO {

    private ArrayList<usuario> usuarios;

    public usuarioDAO() {
        usuarios = new ArrayList<>();
    }

    public void guardar(usuario usuario) {
        usuarios.add(usuario);
    }

    public ArrayList<usuario> listar() {
        return usuarios;
    }

}