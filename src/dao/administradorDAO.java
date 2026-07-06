package dao;

import model.administrador;
import java.util.ArrayList;

public class administradorDAO {

    private ArrayList<administrador> administradores;

    public administradorDAO() {
        administradores = new ArrayList<>();
    }

    public void guardar(administrador administrador) {
        administradores.add(administrador);
    }

    public ArrayList<administrador> listar() {
        return administradores;
    }

}