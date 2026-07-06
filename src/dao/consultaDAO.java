package dao;

import model.consulta;
import java.util.ArrayList;

public class consultaDAO {

    private ArrayList<consulta> consultas;

    public consultaDAO() {
        consultas = new ArrayList<>();
    }

    public void guardar(consulta consulta) {
        consultas.add(consulta);
    }

    public ArrayList<consulta> listar() {
        return consultas;
    }

}