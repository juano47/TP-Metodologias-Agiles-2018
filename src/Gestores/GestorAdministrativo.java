/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoAdministrativo;
import Entidades.Administrativo;

//COMPROBAR QUE FUNCIONA COMO SINGLETON!
/**
 *
 * @author John
 */
public class GestorAdministrativo {
    
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
    
     //no creo que sea necesario y hasta peligroso
    /*public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }
    */
}
