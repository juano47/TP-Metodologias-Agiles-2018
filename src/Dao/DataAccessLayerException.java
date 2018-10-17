/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

/**
 *
 * @author Rolando
 */
public class DataAccessLayerException extends RuntimeException {

    public DataAccessLayerException() {
    }

    public DataAccessLayerException(String message) {
        super(message);
    }

    public DataAccessLayerException(Throwable cause) {
        super(cause);
    }

    public DataAccessLayerException(String message, Throwable cause) {
        super(message, cause);
    }
}