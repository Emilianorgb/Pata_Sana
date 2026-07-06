package dao;

import model.veterinario;
import java.util.ArrayList;

public class veterinarioDAO {

    private ArrayList<veterinario> veterinarios;

    public veterinarioDAO() {
        veterinarios = new ArrayList<>();
    }

    public void guardar(veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public ArrayList<veterinario> listar() {
        return veterinarios;
    }

} 