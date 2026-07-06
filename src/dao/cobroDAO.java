package dao;

import model.cobro;
import java.util.ArrayList;

public class cobroDAO {

    private ArrayList<cobro> cobros;

    public cobroDAO() {
        cobros = new ArrayList<>();
    }

    public void guardar(cobro cobro) {
        cobros.add(cobro);
    }

    public ArrayList<cobro> listar() {
        return cobros;
    }

}