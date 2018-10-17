/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoAdministrativo;
import Dao.LDAP;
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
        LDAP ldap = new LDAP();
        idAdministrativo=ldap.findPorUsernameYClave(username, password);
        if(idAdministrativo!=null){
        
        DaoAdministrativo administrativoDAO = new DaoAdministrativo();
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
