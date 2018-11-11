/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gestores;

import Dao.DaoTitular;
import Entidades.Licencia;
import Entidades.Titular;
import Entidades.TitularAuxParaTabla;
import Pantallas.GestionLicencias;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//COMPROBAR QUE FUNCIONA COMO SINGLETON!
/**
 *
 * @author John
 */
public class GestorTitular {
    
    DaoTitular daoTitular = new DaoTitular();
    //private Titular titular;
    
    private GestorTitular() {
    }
    
    public static GestorTitular getInstance() {
        return GestorTablaHolder.INSTANCE;
    }

    private static class GestorTablaHolder {

        private static final GestorTitular INSTANCE = new GestorTitular();
    }
    
     
     // Busca todos los puestos por codigo puesto y empresa
    public List<TitularAuxParaTabla> buscarTitulares() {

        List listaTitulares = null;
        TitularAuxParaTabla titularAuxParaTabla = new TitularAuxParaTabla();
        Titular titular;
        listaTitulares = daoTitular.findPorNombreApellidoDni();
            
        List<TitularAuxParaTabla> listaTitularAux = new ArrayList<TitularAuxParaTabla>();
        
        for (int a = 0; a < listaTitulares.size(); a++) {
            titular = (Titular) listaTitulares.get(a);
            Licencia licencia;
            if(!titular.getLicencias().isEmpty()){
                
                //convierto y guardo las licencias vinculadas al titular
                List<Licencia> licencias = new ArrayList<Licencia>();
                licencias.addAll(titular.getLicencias());
                
                //por cada licencia creo un objeto titularAuxParaTabla para poder mostrar una linea por c/ licencia qu tenga
                for(int b=0; b<titular.getLicencias().size(); b++){
                    titularAuxParaTabla = new TitularAuxParaTabla();
                    titularAuxParaTabla.setTitularOriginal(titular);
                    licencia=licencias.get(b);
                    titularAuxParaTabla.setLicencia(licencia);
                  //  System.out.println(titularAuxParaTabla.getTitularOriginal().getApellido());
                    listaTitularAux.add(titularAuxParaTabla);
                   // modeloTabla.addTitular(titularAuxParaTabla);                 
                }
            }    
        }    
        return listaTitularAux;
    }
    
    public List<TitularAuxParaTabla> buscarTitulares(String nombre, String apellido, String dni) {
   
        List listaTitulares = null;
        TitularAuxParaTabla titularAuxParaTabla = new TitularAuxParaTabla();
        Titular titular;
        listaTitulares = daoTitular.findPorNombreApellidoDni(nombre, apellido, dni);
            
        List<TitularAuxParaTabla> listaTitularAux = new ArrayList<TitularAuxParaTabla>();
        
        for (int a = 0; a < listaTitulares.size(); a++) {
            titular = (Titular) listaTitulares.get(a);
            Licencia licencia;
            if(!titular.getLicencias().isEmpty()){
                
                //convierto y guardo las licencias vinculadas al titular
                List<Licencia> licencias = new ArrayList<Licencia>();
                licencias.addAll(titular.getLicencias());
                
                //por cada licencia creo un objeto titularAuxParaTabla para poder mostrar una linea por c/ licencia qu tenga
                for(int b=0; b<titular.getLicencias().size(); b++){
                    titularAuxParaTabla = new TitularAuxParaTabla();
                    titularAuxParaTabla.setTitularOriginal(titular);
                    licencia=licencias.get(b);
                    titularAuxParaTabla.setLicencia(licencia);
                  //  System.out.println(titularAuxParaTabla.getTitularOriginal().getApellido());
                    listaTitularAux.add(titularAuxParaTabla);
                   // modeloTabla.addTitular(titularAuxParaTabla);                 
                }
            }     
        }    
        return listaTitularAux;
    }
    
    public void modificarTitular(Titular titular_aux) {
       daoTitular.update(titular_aux);
    }
}
