package dao;

import model.propietario;
import java.util.ArrayList;

public class propietarioDAO {

    private ArrayList<propietario> propietarios;

    public propietarioDAO() {
        propietarios = new ArrayList<>();
    }

    public void guardar(propietario propietario) {
        propietarios.add(propietario);
    }

    public ArrayList<propietario> listar() {
        return propietarios;
    }

    public propietario buscar(int id) {

        for (propietario propietario : propietarios) {

            if (propietario.getIdPropietario() == id) {
                return propietario;
            }

        }

        return null;
    }

    public boolean eliminar(int id) {

        propietario propietario = buscar(id);

        if (propietario != null) {
            propietarios.remove(propietario);
            return true;
        }

        return false;
    }

}