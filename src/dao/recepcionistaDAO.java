package dao;

import model.recepcionista;
import java.util.ArrayList;

public class recepcionistaDAO {

    private ArrayList<recepcionista> recepcionistas;

    public recepcionistaDAO() {
        recepcionistas = new ArrayList<>();
    }

    public void guardar(recepcionista recepcionista) {
        recepcionistas.add(recepcionista);
    }

    public ArrayList<recepcionista> listar() {
        return recepcionistas;
    }

}