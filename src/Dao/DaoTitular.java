/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Titular;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author Rolando
 */
public class DaoTitular extends AbstractDao {

    public DaoTitular() {
        super();
    }

    //trae TODOS los registros de titular
    public List findPorNombreApellidoDni() throws DataAccessLayerException{
        List objects = null;
        try {
            startOperation();
            Query query;
            query = session.createQuery("from Titular");     
            objects = query.list();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return objects;
    }
    
    
/*
    public void update(Titular administrativo) throws DataAccessLayerException {
        super.update(administrativo);
    }

   
    public void delete(Titular administrativo) throws DataAccessLayerException {
        super.delete(administrativo);
    }

   
    public Titular find(Long id) throws DataAccessLayerException {
        return (Titular) super.find(Titular.class, id);
    }

    
     // Lista todos los usuarios de la base de datos
     
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Titular.class);
    }

    public Titular buscarTitular(Integer idAdministrativo) {
        Titular administrativo=null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Titular where id_administrativo= :idAdministrativo");
          query.setParameter("idAdministrativo", idAdministrativo);
          
          administrativo = (Titular) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return administrativo;
    }
    
    public Integer findPorUsernameYClave(String username, String password) throws DataAccessLayerException {
        Integer idAdministrativo=null;
        try {
            startOperation();
            
          Query query = session.createSQLQuery("SELECT id_administrativo from Titular where username= :username and password= :password");
                                                                                                                            //BD        java
          query.setParameter("username", username);
          query.setParameter("password", password);
          idAdministrativo = (Integer) query.uniqueResult();
            tx.commit();
        } catch (HibernateException e) {
            handleException(e);
        } finally {
            HibernateFactory.close(session);
        }
        return idAdministrativo;
    }
    */
}
