package dao;

import model.recibo;
import java.util.ArrayList;

public class reciboDAO {

    private ArrayList<recibo> recibos;

    public reciboDAO() {
        recibos = new ArrayList<>();
    }

    public void guardar(recibo recibo) {
        recibos.add(recibo);
    }

    public ArrayList<recibo> listar() {
        return recibos;
    }

    public recibo buscar(int id) {

        for (recibo recibo : recibos) {

            if (recibo.getIdRecibo() == id) {
                return recibo;
            }

        }

        return null;
    }

    public boolean eliminar(int id) {

        recibo recibo = buscar(id);

        if (recibo != null) {
            recibos.remove(recibo);
            return true;
        }

        return false;
    }
}