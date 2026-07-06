package dao;

import model.cita;
import java.util.ArrayList;

public class citaDAO {

    private ArrayList<cita> citas;

    public citaDAO() {
        citas = new ArrayList<>();
    }

    public void guardar(cita cita) {
        citas.add(cita);
    }

    public ArrayList<cita> listar() {
        return citas;
    }

}
