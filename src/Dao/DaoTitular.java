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
    
    public void save(Titular titular) throws DataAccessLayerException {
        super.save(titular); 
    }
    

    public void update(Titular titular) throws DataAccessLayerException {
        super.update(titular);
    }
    

   /*
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

    public List findPorNombreApellidoDni(String nombre, String apellido, String dni) {
        
        List objects = null;

        nombre = "%" + nombre + "%";     //al usar el criterio contiene busco todas las cadenas que contengan codigo
        apellido = "%" + apellido + "%";
        dni = "%" + dni + "%";
        try {
            startOperation();
            Query query;

           if (nombre!=null && apellido!=null && dni!=null)  { //busqueda por los tres parametros
               query = session.createQuery("from Titular WHERE dni LIKE :dni AND nombre LIKE :nombre AND apellido LIKE :apellido");     
                query.setParameter("nombre", nombre);
                query.setParameter("apellido", apellido);
                query.setParameter("dni", dni);
                objects = query.list();
           }
           else if("".equals(apellido)){ //busqueda solo por dni y nombre
               query = session.createQuery("from Titular WHERE dni LIKE :dni AND nombre LIKE :nombre");    
                query.setParameter("nombre", nombre);
                query.setParameter("apellido", apellido);
                objects = query.list();
           }
            else if("".equals(nombre)){ //busqueda solo por dni y apellido
               query = session.createQuery("from Titular WHERE dni LIKE :dni AND apellido LIKE :apellido");     
                query.setParameter("nombre", nombre);
                query.setParameter("dni", dni);
                objects = query.list();
           }
            else if ("".equals(dni)) { //busqueda solo por nombre y apellido
                query = session.createQuery("from Titular WHERE nombre LIKE :nombre AND apellido LIKE :apellido");
                query.setParameter("apellido", apellido);
                query.setParameter("nombre", nombre);
                objects = query.list();
            } else if ("".equals(apellido) && "".equals(nombre)){ //busqueda solo por dni
                query = session.createQuery("from Titular WHERE dni LIKE :dni");      //el operador like funciona solo con cadenas por eso uso esto para dni
                query.setParameter("dni", dni);
                objects = query.list();
            } else if ("".equals(apellido) && "".equals(dni)) { //busqueda solo por nombre
                query = session.createQuery("from Titular WHERE nombre LIKE :nombre");
                query.setParameter("nombre", nombre);
                objects = query.list();
            } else if ("".equals(nombre) && "".equals(dni)) { //busqueda solo por apellido
                query = session.createQuery("from Titular WHERE apellido LIKE :apellido");
                query.setParameter("apellido", apellido);
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
