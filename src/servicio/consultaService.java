package servicio;

import dao.consultaDAO;
import model.consulta;

import java.util.ArrayList;

public class consultaService {

    private consultaDAO dao;

    public consultaService() {
        dao = new consultaDAO();
    }

    public void guardar(consulta consulta) {
        dao.guardar(consulta);
    }

    public ArrayList<consulta> listar() {
        return dao.listar();
    }
}