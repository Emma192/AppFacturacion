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
public class Persona {
    
    private String idPersona;
    private String nombre; 
    private String apellido1;
    private String Apellido2;
    private String Fecha;
    private String correo;
    private String telefono;

    public Persona() {
    }

    public Persona(String idPersona, String nombre, String apellido1, String Apellido2, String Fecha, String correo, String telefono) {
        this.idPersona = idPersona;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.Apellido2 = Apellido2;
        this.Fecha = Fecha;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getidPersona() {
        return idPersona;
    }

    public void setidPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", Apellido2=" + Apellido2 + ", Fecha=" + Fecha + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
    
    
}
    
    
    