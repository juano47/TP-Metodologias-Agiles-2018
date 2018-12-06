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
    
    /**
    * Devuelve el resultado de la consulta para el posterior procesado
    *
    * @param  arregloParametros son los parametros indicados para el filtrado por el usuario, si no especifico nada el valor del mismo es null
    * @return el resultado de la consulta en forma de lista
    * @see generarQuery
    */
    public List porCamposRequeridos(ArrayList<String> arregloParametros) {
        
        List objects = null;
        
        String queryString = "SELECT DISTINCT l from Licencia l JOIN l.titular t";
        queryString = generarQuery(queryString, arregloParametros, 0);
        queryString = queryString.replaceFirst("AND", "WHERE");
        try {
            startOperation();
            Query query;
            
            query = session.createQuery(queryString);     
            if(!StringUtils.isNullOrEmpty(arregloParametros.get(0))) query.setParameter("nombre", "%"+arregloParametros.get(0)+"%");
            if(!StringUtils.isNullOrEmpty(arregloParametros.get(1))) query.setParameter("apellido", "%"+arregloParametros.get(1)+"%");
            if(!StringUtils.isNullOrEmpty(arregloParametros.get(2))) query.setParameter("grupo_sanguineo", "%"+arregloParametros.get(2)+"%");
            if(!StringUtils.isNullOrEmpty(arregloParametros.get(3))) query.setParameter("factor_sanguineo", "%"+arregloParametros.get(3)+"%");
            if(!StringUtils.isNullOrEmpty(arregloParametros.get(4))) query.setParameter("donante", "%"+arregloParametros.get(4)+"%");
            objects = query.list();
           
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
    /**
    * Devuelve la estructura final de la query generada de manera recursiva. 
    *
    * @param  query  es la estructura base de la query
    * @param  arregloParametros son los parametros indicados para el filtrado por el usuario, si no especifico nada el valor del mismo es null
    * @param  index  la posicion actual de arregloParametros, inicialmente 0
    * @return la query final con todas las condiciones requeridas
    */
    public String generarQuery(String query, ArrayList<String> arregloParametros, int index) {
        
        String dato = arregloParametros.get(index);
        
        switch(index){
            case 0:
                if(!StringUtils.isNullOrEmpty(dato)) query = query.concat(" AND t.nombre LIKE :nombre");
                break;
            case 1:
                if(!StringUtils.isNullOrEmpty(dato)) query = query.concat(" AND t.apellido LIKE :apellido");
                break;
            case 2:
                if(!StringUtils.isNullOrEmpty(dato)) query = query.concat(" AND t.grupoSanguineo LIKE :grupo_sanguineo");
                break;
            case 3:
                if(!StringUtils.isNullOrEmpty(dato)) query = query.concat(" AND t.factorSanguineo LIKE :factor_sanguineo");
                break;
            case 4:
                if(!StringUtils.isNullOrEmpty(dato)) query = query.concat(" AND l.donante LIKE :donante");
                break;
            case 5:
                if(StringUtils.isNullOrEmpty(dato)){ query = query.concat("");}
                else if(dato.equals("Solo Vigentes")){
                    query = query.concat(" AND l.fechaVenc >= NOW()");
                }
                else if(dato.equals("Solo Expiradas")){
                    query = query.concat(" AND l.fechaVenc <= NOW()");
                }
                break;
        }
        
        index++;
        
        if(index < 6){
            query = generarQuery(query, arregloParametros, index);
        }
        
        return query;
    }
}
