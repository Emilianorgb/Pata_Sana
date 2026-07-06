package dao;

import model.vacuna;
import java.util.ArrayList;

public class vacunaDAO {

    private ArrayList<vacuna> vacunas;

    public vacunaDAO() {
        vacunas = new ArrayList<>();
    }

    public void guardar(vacuna vacuna) {
        vacunas.add(vacuna);
    }

    public ArrayList<vacuna> listar() {
        return vacunas;
    }

}
