/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.Controlador;

import ec.edu.ups.DAO.ITelefonoDao;
import ec.edu.ups.Vista.Telefono;

import ec.edu.ups.ventana.Datos;
import java.util.List;

/**
 *
 * @author nicol
 */
public class ControladorTelefono {

    
    private ITelefonoDao dao;
    private Datos vista;

    public ControladorTelefono( ITelefonoDao dao, Datos vista) {
        
        this.dao = dao;
        this.vista = vista;
    }

    public void registrarTelfono() {
        Telefono t = vista.ingresarTelefono();
        dao.crearTelefono(t);
    }

    public void verTelefono(){
        List<Telefono> telefonos;
        telefonos = dao.listarTelefono();
        vista.mostrarTelefono(telefonos);
    }

}
