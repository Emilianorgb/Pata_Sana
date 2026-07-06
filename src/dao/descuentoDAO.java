package dao;

import model.descuento;
import java.util.ArrayList;

public class descuentoDAO {

    private ArrayList<descuento> descuentos;

    public descuentoDAO() {
        descuentos = new ArrayList<>();
    }

    public void guardar(descuento descuento) {
        descuentos.add(descuento);
    }

    public ArrayList<descuento> listar() {
        return descuentos;
    }

    public descuento buscar(int id) {

        for (descuento descuento : descuentos) {

            if (descuento.getIdDescuento() == id) {
                return descuento;
            }

        }

        return null;
    }

    public boolean eliminar(int id) {

        descuento descuento = buscar(id);

        if (descuento != null) {
            descuentos.remove(descuento);
            return true;
        }

        return false;
    }
}