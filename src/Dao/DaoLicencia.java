/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Licencia;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;

/**
 *
 * @author augusto
 */
public class DaoLicencia extends AbstractDao{
    
    public DaoLicencia() {
        super();
    }
    
    public void update(Licencia licencia) throws DataAccessLayerException {
        super.update(licencia);
    }
    
    public void save(Licencia licencia) throws DataAccessLayerException {
        super.save(licencia);
    }
    
    public Licencia find(Long id) throws DataAccessLayerException {
        startOperation();
        return (Licencia) super.find(Licencia.class, id);
    }
    
//<--------------------------------------------------------------------->

    public List findAll() throws DataAccessLayerException {
        return super.findAll(Licencia.class);
    }
    
    public Licencia buscarLicencia(Integer idLicencia) {
        Licencia licencia=null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Licencia where id_licencia= :idLicencia");
          query.setParameter("idLicencia", idLicencia);
          
          licencia = (Licencia) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return licencia;
    }
    
    
    public List porCamposRequeridos() throws DataAccessLayerException{
        List objects = null;
        try {
            startOperation();
            Query query;
            //query = session.createQuery("SELECT DISTINCT t.nombre, t.apellido, t.grupo_sanguineo, t.factor_sanguineo, l.clase, l.donante FROM Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE l.fecha_venc >= NOW()");        
            query = session.createQuery("FROM Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE l.fecha_venc >= NOW()");
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
    public List porCamposRequeridos(String nombre, String apellido, String grupo_sanguineo, String factor_sanguineo, String donante) {
        
        List objects = null;

        nombre = "%" + nombre + "%";     //al usar el criterio contiene busco todas las cadenas que contengan codigo
        apellido = "%" + apellido + "%";
        //grupo_sanguineo =  grupo_sanguineo;
        //factor_sanguineo = factor_sanguineo;
        //donante = donante;
        try {
            startOperation();
            Query query;

           if (nombre!=null && apellido!=null && grupo_sanguineo!=null && factor_sanguineo!=null && donante!=null)  { //busqueda por todos los parametros
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");     
                query.setParameter("nombre", nombre);
                query.setParameter("apellido", apellido);
                query.setParameter("grupo_sanguineo", grupo_sanguineo);
                query.setParameter("factor_sanguineo", factor_sanguineo);
                query.setParameter("donante", donante);
                objects = query.list();
           }
           else if("".equals(apellido) && "".equals(grupo_sanguineo) && "".equals(factor_sanguineo) && "".equals(donante) ){ //busqueda solo por nombre
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND l.fecha_venc >= NOW()");     
               query.setParameter("nombre", nombre);
               objects = query.list();
           }
           else if("".equals(nombre) && "".equals(grupo_sanguineo) && "".equals(factor_sanguineo) && "".equals(donante) ){ //busqueda solo por apellido
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.apellido LIKE :apellido AND l.fecha_venc >= NOW()");     
               query.setParameter("apellido", apellido);
               objects = query.list();
           }
           else if("".equals(nombre) && "".equals(apellido) && "".equals(factor_sanguineo) && "".equals(donante) ){ //busqueda solo por grupo_sanguineo
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.grupo_sanguineo LIKE :grupo_sanguineo AND l.fecha_venc >= NOW()");     
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               objects = query.list();
           } 
           else if("".equals(nombre) && "".equals(apellido) && "".equals(grupo_sanguineo) && "".equals(donante) ){ //busqueda solo por factor_sanguineo
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.factor_sanguineo LIKE :factor_sanguineo AND l.fecha_venc >= NOW()");     
               query.setParameter("factor_sanguineo", factor_sanguineo);
               objects = query.list();
           }
           else if("".equals(nombre) && "".equals(apellido) && "".equals(grupo_sanguineo) && "".equals(factor_sanguineo) ) { //busqueda solo por donante
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE l.donante LIKE :donante AND l.fecha_venc >= NOW()");     
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if("".equals(grupo_sanguineo) && "".equals(factor_sanguineo) && "".equals(donante)) { //busqueda solo por nombre y apellido
                query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND l.fecha_venc >= NOW()");                
                query.setParameter("nombre", nombre);
                query.setParameter("apellido", apellido);
                objects = query.list();
           }
           else if("".equals(nombre) && "".equals(factor_sanguineo) && "".equals(donante)) { //busqueda solo por apellido y grupo_sanguineo
                query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND l.fecha_venc >= NOW()");                
                query.setParameter("apellido", apellido);
                query.setParameter("grupo_sanguineo", grupo_sanguineo);
                objects = query.list();
           }
           else if("".equals(nombre) && "".equals(apellido) && "".equals(donante)) { //busqueda solo por grupo_sanguineo y factor_sanguineo
                query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.fecha_venc >= NOW()");                
                query.setParameter("grupo_sanguineo", grupo_sanguineo);
                query.setParameter("factor_sanguineo", factor_sanguineo);
                objects = query.list();
           }
           else if("".equals(nombre) && "".equals(apellido) && "".equals(grupo_sanguineo)) { //busqueda solo por factor_sanguineo y donante
                query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.factor_sanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");                
                query.setParameter("factor_sanguineo", factor_sanguineo);
                query.setParameter("donante", donante);
                objects = query.list();
           }
           else if("".equals(factor_sanguineo) && "".equals(donante) ) { //busqueda solo por nombre, apellido y grupo_sanguineo
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND l.fecha_venc >= NOW()");     
               query.setParameter("nombre", nombre);
               query.setParameter("apellido", apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               objects = query.list();
           }
           else if("".equals(nombre) && "".equals(donante) ) { //busqueda solo por apellido y grupo_sanguineo y factor_sanguineo
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.fecha_venc >= NOW()");    
               query.setParameter("apellido", apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               objects = query.list();
           }
           else if("".equals(nombre) && "".equals(apellido) ) { //busqueda solo por grupo_sanguineo, factor_sanguineo y donante
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");    
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if("".equals(nombre)) { //busqueda solo por apellido, grupo_sanguineo, factor_sanguineo y donante
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");    
               query.setParameter("apellido",apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if("".equals(apellido)) { //busqueda solo por nombre, grupo_sanguineo, factor_sanguineo y donante
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");    
               query.setParameter("nombre",nombre);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if("".equals(grupo_sanguineo)) { //busqueda solo por nombre, apellido, factor_sanguineo y donante
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.factor_sanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");    
               query.setParameter("nombre", nombre); 
               query.setParameter("apellido",apellido);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if("".equals(factor_sanguineo)) { //busqueda solo por nombre, apellido, grupo_sanguineo y donante
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND l.donante LIKE :donante AND l.fecha_venc >= NOW()");    
               query.setParameter("nombre", nombre); 
               query.setParameter("apellido",apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if("".equals(donante)) { //busqueda solo por nombre, apellido, grupo_sanguineo y factor_sanguineo
               query = session.createQuery("from Licencia l JOIN Titular t ON(l.id_titular = t.id_titular) WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupo_sanguineo LIKE :grupo_sanguineo AND t.factor_sanguineo LIKE :factor_sanguineo AND l.fecha_venc >= NOW()");    
               query.setParameter("nombre", nombre); 
               query.setParameter("apellido",apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               objects = query.list();
           }
           
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
    
    //<--------------------------------------------------------------------->
    
    public List findLicenciasPorCriterio(int criterio, ArrayList<String> arregloParametros){
        List response = null;
        
        try {
            startOperation();
            Query query;
            switch (criterio) {
                case 5:
                        query = session.createQuery("from Licencia L WHERE L.fechaVenc <= :date");
                        query.setDate("date", new Date());
                        response = query.list();
                         break;
            }
            
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        
        return response;
    }
    
}
