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
public class LDAP extends AbstractDao {

    public LDAP() {
        super();
    }

    /**
     * Insert a new Usuario into the database.
     * @param <error>
     * @param <error>
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
    
    //agregado por el negro
    public Integer findPorUsernameYClave(String username, String password) throws DataAccessLayerException {
        Integer idAdministrativo=null;
        try {
            startOperation();
            
          Query query = session.createSQLQuery("SELECT id_administrativo from LDAP where username= :username and clave= :password");
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

    /**
     * Lista todos los usuarios de la base de datos
     * @return
     */
    public List findAll() throws DataAccessLayerException {
        return super.findAll(Administrativo.class);
    }
}
