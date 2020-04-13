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
public class Empleado extends Persona {

    private String puesto;
    private int salario;
    private int fechaEntrada;
    private int fechaSalida;

    
    public String getPuesto() {
        return puesto;
    }
    
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(int fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public int getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(int fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Empleado{" + "puesto=" + puesto + ", salario=" + salario + ", fechaEntrada=" + fechaEntrada + ", fechaSalida=" + fechaSalida + '}';
    }
    

    public Empleado(String puesto, int salario, int fechaEntrada, int fechaSalida) {
        this.puesto = puesto;
        this.salario = salario;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Empleado() {
    }
    
}
