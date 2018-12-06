/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Licencia;
import com.mysql.jdbc.StringUtils;
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
    
    public List porCamposRequeridos(String nombre, String apellido, String grupo_sanguineo, String factor_sanguineo, String donante, String vigencia) {
        
        List objects = null;
        
        if(!StringUtils.isNullOrEmpty(apellido)){
            apellido = "%" + apellido + "%";
        }
        if(!StringUtils.isNullOrEmpty(nombre)){
            nombre = "%" + nombre + "%";
        }
        if(!StringUtils.isNullOrEmpty(grupo_sanguineo)){
            grupo_sanguineo = "%" + grupo_sanguineo + "%";
        }
        if(!StringUtils.isNullOrEmpty(factor_sanguineo)){
            factor_sanguineo = "%" + factor_sanguineo + "%";
        }
        if(!StringUtils.isNullOrEmpty(donante)){
            donante = "%" + donante + "%";
        }
        

        try {
            startOperation();
            Query query;

           if (nombre!=null && apellido!=null && grupo_sanguineo!=null && factor_sanguineo!=null && donante!=null)  { //busqueda por todos los parametros
               query = session.createQuery("SELECT DISTINCT l FROM Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante"+ vigencia);     
                query.setParameter("nombre", nombre);
                query.setParameter("apellido", apellido);
                query.setParameter("grupo_sanguineo", grupo_sanguineo);
                query.setParameter("factor_sanguineo", factor_sanguineo);
                query.setParameter("donante", donante);
                objects = query.list();
                
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(grupo_sanguineo) && StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante)){
               vigencia = vigencia.replace("AND", "WHERE");
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular"+ vigencia);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(grupo_sanguineo) && StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante) ){ //busqueda solo por nombre
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre"+vigencia);     
               query.setParameter("nombre", nombre);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(grupo_sanguineo) && StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante) ){ //busqueda solo por apellido
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.apellido LIKE :apellido"+vigencia);     
               query.setParameter("apellido", apellido);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante) ){ //busqueda solo por grupo_sanguineo
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.grupoSanguineo LIKE :grupo_sanguineo"+vigencia);     
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               objects = query.list();
           } 
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(grupo_sanguineo) && StringUtils.isNullOrEmpty(donante) ){ //busqueda solo por factor_sanguineo
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.factorSanguineo LIKE :factor_sanguineo"+vigencia);     
               query.setParameter("factor_sanguineo", factor_sanguineo);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(grupo_sanguineo) && StringUtils.isNullOrEmpty(factor_sanguineo) ) { //busqueda solo por donante
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE l.donante LIKE :donante"+vigencia);     
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(grupo_sanguineo) && StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante)) { //busqueda solo por nombre y apellido
                query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido"+vigencia);                
                query.setParameter("nombre", nombre);
                query.setParameter("apellido", apellido);
                objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante)) { //busqueda solo por apellido y grupo_sanguineo
                query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo"+vigencia);                
                query.setParameter("apellido", apellido);
                query.setParameter("grupo_sanguineo", grupo_sanguineo);
                objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(donante)) { //busqueda solo por grupo_sanguineo y factor_sanguineo
                query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo"+vigencia);                
                query.setParameter("grupo_sanguineo", grupo_sanguineo);
                query.setParameter("factor_sanguineo", factor_sanguineo);
                objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) && StringUtils.isNullOrEmpty(grupo_sanguineo)) { //busqueda solo por factor_sanguineo y donante
                query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.factorSanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante"+vigencia);                
                query.setParameter("factor_sanguineo", factor_sanguineo);
                query.setParameter("donante", donante);
                objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(factor_sanguineo) && StringUtils.isNullOrEmpty(donante) ) { //busqueda solo por nombre, apellido y grupo_sanguineo
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo"+vigencia);     
               query.setParameter("nombre", nombre);
               query.setParameter("apellido", apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(donante) ) { //busqueda solo por apellido y grupo_sanguineo y factor_sanguineo
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo"+vigencia);    
               query.setParameter("apellido", apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre) && StringUtils.isNullOrEmpty(apellido) ) { //busqueda solo por grupo_sanguineo, factor_sanguineo y donante
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante"+vigencia);    
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(nombre)) { //busqueda solo por apellido, grupo_sanguineo, factor_sanguineo y donante
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante"+vigencia);    
               query.setParameter("apellido",apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(apellido)) { //busqueda solo por nombre, grupo_sanguineo, factor_sanguineo y donante
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante"+vigencia);    
               query.setParameter("nombre",nombre);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(grupo_sanguineo)) { //busqueda solo por nombre, apellido, factor_sanguineo y donante
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.factorSanguineo LIKE :factor_sanguineo AND l.donante LIKE :donante"+vigencia);    
               query.setParameter("nombre", nombre); 
               query.setParameter("apellido",apellido);
               query.setParameter("factor_sanguineo", factor_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(factor_sanguineo)) { //busqueda solo por nombre, apellido, grupo_sanguineo y donante
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo AND l.donante LIKE :donante"+vigencia);    
               query.setParameter("nombre", nombre); 
               query.setParameter("apellido",apellido);
               query.setParameter("grupo_sanguineo", grupo_sanguineo);
               query.setParameter("donante", donante);
               objects = query.list();
           }
           else if(StringUtils.isNullOrEmpty(donante)) { //busqueda solo por nombre, apellido, grupo_sanguineo y factor_sanguineo
               query = session.createQuery("SELECT DISTINCT l from Licencia l JOIN l.titular t WHERE t.nombre LIKE :nombre AND t.apellido LIKE :apellido AND t.grupoSanguineo LIKE :grupo_sanguineo AND t.factorSanguineo LIKE :factor_sanguineo"+vigencia);    
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
}
