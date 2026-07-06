package dao;

import model.mascota;
import java.util.ArrayList;

public class mascotaDAO {

    private ArrayList<mascota> mascotas;

    public mascotaDAO() {
        mascotas = new ArrayList<>();
    }

    public void guardar(mascota mascota) {
        mascotas.add(mascota);
    }

    public ArrayList<mascota> listar() {
        return mascotas;
    }

    public mascota buscar(int id) {

        for (mascota mascota : mascotas) {

            if (mascota.getIdMascota() == id) {
                return mascota;
            }

        }

        return null;
    }

    public boolean eliminar(int id) {

        mascota mascota = buscar(id);

        if (mascota != null) {
            mascotas.remove(mascota);
            return true;
        }

        return false;
    }

}