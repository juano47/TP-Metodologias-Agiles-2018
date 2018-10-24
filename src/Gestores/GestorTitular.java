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
    public void buscarTitulares(GestionLicencias.CustomTableModel modeloTabla) {

        List listaTitulares = null;
        TitularAuxParaTabla titularAuxParaTabla = new TitularAuxParaTabla();
        Titular titular;
        listaTitulares = daoTitular.findPorNombreApellidoDni();
        
        int id;
    
        
        for (int a = 0; a < listaTitulares.size(); a++) {
            titular = (Titular) listaTitulares.get(a);
            id=titular.getIdTitular();
             Licencia licencia;
                Date fechaVenc;
                String clase;
                String estado;
            if(!titular.getLicencias().isEmpty()){
               
                //convierto y guardo las licencias vinculadas al titular
                List<Licencia> licencias = new ArrayList<Licencia>();
                licencias.addAll(titular.getLicencias());
                
                //por cada licencia creo un objeto titularAuxParaTabla para poder mostrar una linea por c/ licencia qu tenga
                for(int b=0; b<titular.getLicencias().size(); b++){
                    titularAuxParaTabla.setIdTitular(titular.getIdTitular());
                     titularAuxParaTabla.setNombre(titular.getNombre());
                     titularAuxParaTabla.setApellido(titular.getApellido());
                     titularAuxParaTabla.setDni(titular.getDni());
                     titularAuxParaTabla.setDomicilio(titular.getDomicilio());
                     titularAuxParaTabla.setFechaNac(titular.getFechaNac());
                     titularAuxParaTabla.setTipoDni(titular.getTipoDni());
                     titularAuxParaTabla.setGrupoSanguineo(titular.getGrupoSanguineo());
                     titularAuxParaTabla.setFactorSanguineo(titular.getFactorSanguineo());
                     titularAuxParaTabla.setLicencias(titular.getLicencias());
                     licencia=licencias.get(b);
                     fechaVenc= licencia.getFechaVenc();
                     clase = licencia.getClase();
                     estado = licencia.getEstado();
                     titularAuxParaTabla.setFechaVenc(fechaVenc);
                     titularAuxParaTabla.setClase(clase);
                     titularAuxParaTabla.setEstado(estado);
                     System.out.println("Gestor1 " + titularAuxParaTabla.getApellido() + "\n");
                     modeloTabla.addTitular(titularAuxParaTabla);
                     
                }
            }
            
            //aunque no tenga licencias asociadas estoy obligado a pasarme a titularAux para usar la tabla
            else{
                titularAuxParaTabla.setIdTitular(titular.getIdTitular());
                     titularAuxParaTabla.setNombre(titular.getNombre());
                     titularAuxParaTabla.setApellido(titular.getApellido());
                     titularAuxParaTabla.setDni(titular.getDni());
                     titularAuxParaTabla.setDomicilio(titular.getDomicilio());
                     titularAuxParaTabla.setFechaNac(titular.getFechaNac());
                     titularAuxParaTabla.setTipoDni(titular.getTipoDni());
                     titularAuxParaTabla.setGrupoSanguineo(titular.getGrupoSanguineo());
                     titularAuxParaTabla.setFactorSanguineo(titular.getFactorSanguineo());
                     titularAuxParaTabla.setLicencias(titular.getLicencias());
                     System.out.println("Gestor2 " + titularAuxParaTabla.getApellido() + "\n");
                     modeloTabla.addTitular(titularAuxParaTabla);
                     

            }
        }
    }
    
     //no creo que sea necesario y hasta peligroso
    /*public void setAdministrativo(Administrativo administrativo) {
        this.administrativo = administrativo;
    }
    */
}
