package dao;

import model.sistema;
import java.util.ArrayList;

public class sistemaDAO {

    private ArrayList<sistema> sistemas;

    public sistemaDAO() {
        sistemas = new ArrayList<>();
    }

    public void guardar(sistema sistema) {
        sistemas.add(sistema);
    }

    public ArrayList<sistema> listar() {
        return sistemas;
    }

    public sistema buscar(String nombre) {

        for (sistema sistema : sistemas) {

            if (sistema.getNombreSistema().equalsIgnoreCase(nombre)) {
                return sistema;
            }

        }

        return null;
    }

    public boolean eliminar(String nombre) {

        sistema sistema = buscar(nombre);

        if (sistema != null) {
            sistemas.remove(sistema);
            return true;
        }

        return false;
    }
}