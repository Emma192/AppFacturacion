/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author emmanuel
 */
public class Proveedor extends Persona {
    
    private int codigo;
    private String compania;
    private String sitioWeb;
    public Proveedor() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCompania() {
        return compania;
    }

    public void setComania(String compania) {
        this.compania = compania;
    }

    public String getSitioWeb() {
        return sitioWeb;
    }

    public void setSitioWeb(String sitioWeb) {
        this.sitioWeb = sitioWeb;
    }

    @Override
    public String toString() {
        return "Proveedor{" + "codigo=" + codigo + ", compania=" + compania + ", sitioWeb=" + sitioWeb + '}';
    }

    public Proveedor(int codigo, String compania, String sitioWeb) {
        this.codigo = codigo;
        this.compania = compania;
        this.sitioWeb = sitioWeb;
    }
    
    
}
