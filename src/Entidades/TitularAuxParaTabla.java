/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author mueve el toto
 */
public class TitularAuxParaTabla {

    
    
    private Titular titularOriginal;
    private Licencia licencia;
    
    public TitularAuxParaTabla() {
    }
    
    public TitularAuxParaTabla(Titular titularOriginal, Licencia licencia) {
        this.titularOriginal = titularOriginal;
        this.licencia = licencia;
    }

    public void setTitularOriginal(Titular titularOriginal) {
        this.titularOriginal = titularOriginal;
    }

    public void setLicencia(Licencia licencia) {
        this.licencia = licencia;
    }

    public Titular getTitularOriginal() {
        return titularOriginal;
    }

    public Licencia getLicencia() {
        return licencia;
    }
}
