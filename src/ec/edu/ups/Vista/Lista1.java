/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Vista;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicol
 */
public class Lista1 {
    private List<Telefono> telefonos;
    
    public Lista1(){
        telefonos = new ArrayList<>();
    }
    
    public void agregrarTelefono(Telefono telefono){
        telefonos.add(telefono);
    }
    
    public List<Telefono> listar(){
        return telefonos;
    }

    @Override
    public String toString() {
        return "Lista{" + telefonos.toString() + '}';
    }
    
    
}
