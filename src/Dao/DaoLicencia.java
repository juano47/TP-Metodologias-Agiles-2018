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
    
    public List findLicenciasPorCriterio(int criterio, ArrayList<String> arregloParametros){
        List response = null;
        
        try {
            startOperation();
            Query query;
            switch (criterio) {
                case 5:
                        query = session.createQuery("from Licencia L WHERE L.fechaVenc >= :date");
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
