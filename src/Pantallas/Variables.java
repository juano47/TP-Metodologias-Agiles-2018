/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallas;

/**
 *
 * @author SANTI
 */
public class Variables {
    String li_nombre;
    String li_apellido;
    String li_dni;
    String li_domicilio;

    public Variables(String li_nombre,String li_apellido, String li_dni, String li_domicilio) {
        this.li_nombre = li_nombre;
        this.li_apellido = li_apellido;
        this.li_dni = li_dni;
        this.li_domicilio = li_domicilio;
    }

    public String getLi_apellido() {
        return li_apellido;
    }

    public void setLi_apellido(String li_apellido) {
        this.li_apellido = li_apellido;
    }

    public String getLi_dni() {
        return li_dni;
    }

    public void setLi_dni(String li_dni) {
        this.li_dni = li_dni;
    }

    public String getLi_domicilio() {
        return li_domicilio;
    }

    public void setLi_domicilio(String li_domicilio) {
        this.li_domicilio = li_domicilio;
    }


    public String getLi_nombre() {
        return li_nombre;
    }

    public void setLi_nombre(String li_nombre) {
        this.li_nombre = li_nombre;
    }
}
