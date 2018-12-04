/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoAdministrativo;
import Entidades.Administrativo;
import java.util.List;

//COMPROBAR QUE FUNCIONA COMO SINGLETON!
/**
 *
 * @author Juan Ignacio de la Iglesia
 */
public class GestorAdministrativo {
    
    DaoAdministrativo daoAdministrativo = new DaoAdministrativo();
    private Administrativo administrativo;
    
    private GestorAdministrativo() {
    }
    
    public static GestorAdministrativo getInstance() {
        return GestorAdministrativoHolder.INSTANCE;
    }

    private static class GestorAdministrativoHolder {
        private static final GestorAdministrativo INSTANCE = new GestorAdministrativo();
    }
    
    public int validarAdministrativo(String username, String password){
    
        Integer idAdministrativo;
        DaoAdministrativo administrativoDAO = new DaoAdministrativo();
        idAdministrativo=administrativoDAO.findPorUsernameYClave(username, password);
        if(idAdministrativo!=null){
        administrativo=administrativoDAO.buscarAdministrativo(idAdministrativo);
        return 1;
        }
        else
        return 0;
    }
    
     public Administrativo getAdministrativo() {
        return this.administrativo;
    }
     
     
    // Busca todos los administrativos por nombre, apellido, dni
    public List<Administrativo> buscarAdministrativos() {
        return daoAdministrativo.findPorNombreApellidoDni();
    }
    
    public List<Administrativo> buscarAdministrativos(String nombre, String apellido, String dni) {
   
        return daoAdministrativo.findPorNombreApellidoDni(nombre, apellido, dni);   
    }
    
    public void modificarAdministrativo(Administrativo administrativo) {
        daoAdministrativo.update(administrativo);
    }
    
     public void guardarAdministrativo(Administrativo administrativo) {
        daoAdministrativo.save(administrativo);
    }
}
