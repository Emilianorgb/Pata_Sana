package servicio;

import dao.vacunaDAO;
import model.vacuna;
import java.util.ArrayList;

public class vacunaService {

    private vacunaDAO dao;

    public vacunaService() {
        dao = new vacunaDAO();
    }

    public void guardar(vacuna vacuna) {
        dao.guardar(vacuna);
    }

    public ArrayList<vacuna> listar() {
        return dao.listar();
    }
}