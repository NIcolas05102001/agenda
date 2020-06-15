/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.DAO;
import ec.edu.ups.Vista.Telefono;
import java.util.List;
/**
 *
 * @author nicol
 */
public interface ITelefonoDao {
    
    public void crearTelefono(Telefono telefono);
    
    public List<Telefono> listarTelefono();
    
}
