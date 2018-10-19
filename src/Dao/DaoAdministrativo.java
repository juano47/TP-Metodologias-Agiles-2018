/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Entidades.Administrativo;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;


/**
 *
 * @author Rolando
 */
public class DaoAdministrativo extends AbstractDao {

    public DaoAdministrativo() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param usuario
     */
    public void save(Administrativo administrativo) throws DataAccessLayerException {
        super.save(administrativo);
    }

    /**
     * Updates a new Usuario into the database.
     * @param usuario
     */
    public void update(Administrativo administrativo) throws DataAccessLayerException {
        super.update(administrativo);
    }

    /**
     * Delete a detached Usuario from the database.
     * @param usuario
     */
    public void delete(Administrativo administrativo) throws DataAccessLayerException {
        super.delete(administrativo);
    }

    /**
     * Find an Event by its primary key.
     * @param id
     * @return
     */
    public Administrativo find(Long id) throws DataAccessLayerException {
        return (Administrativo) super.find(Administrativo.class, id);
    }

    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Administrativo.class);
    }

    public Administrativo buscarAdministrativo(Integer idAdministrativo) {
        Administrativo administrativo=null;
        try {
            startOperation();
            
          Query query = session.createQuery("from Administrativo where id_administrativo= :idAdministrativo");
          query.setParameter("idAdministrativo", idAdministrativo);
          
          administrativo = (Administrativo) query.uniqueResult();
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
            
          Query query = session.createSQLQuery("SELECT id_administrativo from Administrativo where username= :username and password= :password");
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
}
