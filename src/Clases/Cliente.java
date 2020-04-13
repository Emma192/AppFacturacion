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
public class Cliente extends Persona{


    private String direccion;
    private String Categoria;

    public Cliente() {
    }
    
  
    

    public Cliente(String direccion, String Categoria) {
        this.direccion = direccion;
        this.Categoria = Categoria;
    }

    public Cliente(String direccion, String Categoria, String idPersona, String nombre, String apellido1, String Apellido2, String Fecha, String correo, String telefono) {
        super(idPersona, nombre, apellido1, Apellido2, Fecha, correo, telefono);
        this.direccion = direccion;
        this.Categoria = Categoria;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" + "direccion=" + direccion + ", Categoria=" + Categoria + '}';
    }
    
    

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

   
  
}
