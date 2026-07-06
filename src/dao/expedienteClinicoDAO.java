package dao;

import model.expedienteClinico;
import java.util.ArrayList;

public class expedienteClinicoDAO {

    private ArrayList<expedienteClinico> expedientes;

    public expedienteClinicoDAO() {
        expedientes = new ArrayList<>();
    }

    public void guardar(expedienteClinico expediente) {
        expedientes.add(expediente);
    }

    public ArrayList<expedienteClinico> listar() {
        return expedientes;
    }

    public expedienteClinico buscar(int id) {

        for (expedienteClinico expediente : expedientes) {

            if (expediente.getIdExpediente() == id) {
                return expediente;
            }

        }

        return null;
    }

    public boolean eliminar(int id) {

        expedienteClinico expediente = buscar(id);

        if (expediente != null) {
            expedientes.remove(expediente);
            return true;
        }

        return false;
    }
}