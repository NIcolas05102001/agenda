/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.DAO;

import ec.edu.ups.Vista.Telefono;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */
public class TelefonoDao implements ITelefonoDao {

    private List<Telefono> listat;

    public TelefonoDao() {
        listat = new ArrayList<>();
    }
    
    @Override
    public void crearTelefono(Telefono telefono) {
        listat.add(telefono);
    }

    @Override
    public List<Telefono> listarTelefono() {
        return listat;
    }

}
