package Entidades;
// Generated Oct 19, 2018 12:09:15 PM by Hibernate Tools 4.3.1



/**
 * Administrativo generated by hbm2java
 */
public class Administrativo  implements java.io.Serializable {


     private Integer idAdministrativo;
     private String nombre;
     private String apellido;
     private int dni;
     private String username;
     private String password;

    public Administrativo() {
    }

    public Administrativo(String nombre, String apellido, int dni, String username, String password) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.username = username;
       this.password = password;
    }
   
    public Integer getIdAdministrativo() {
        return this.idAdministrativo;
    }
    
    public void setIdAdministrativo(Integer idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }




}


