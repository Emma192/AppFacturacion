/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;


import java.net.URL;
import java.sql.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.util.*;
import net.sf.jasperreports.view.JasperViewer;



/**
 *
 * @author emque
 */
public class ClienteDAO extends Conexion {
    public ResultSet cargarClientes(){
    
        try {
            obj_Procedimiento = getConexion().prepareCall("CALL clienteBuscarTodos");
            rs = obj_Procedimiento.executeQuery();
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            
        }
        return rs;
    }
    
     public boolean insertarClient(Cliente client){
         boolean rpta = false;
    try {
         //Nos conectamos
         conectarBD();
         //Busca los datos del profesor
         String call = "{CALL clienteInsertar(?,?,?,?,?,?,?,?,?)}";
         //Preparamos la sentencia
         obj_Procedimiento = conexion.prepareCall(call);
         //Identificacion
         obj_Procedimiento.setString(1, client.getidPersona());
         obj_Procedimiento.setString(2, client.getNombre());
         obj_Procedimiento.setString(3, client.getApellido1());
         obj_Procedimiento.setString(4, client.getApellido2());
         obj_Procedimiento.setString(5, client.getFecha());
         obj_Procedimiento.setString(6, client.getCorreo());
         obj_Procedimiento.setString(7, client.getTelefono());
         obj_Procedimiento.setString(8, client.getDireccion());
         obj_Procedimiento.setString(9, client.getCategoria());
     
         
         rpta = obj_Procedimiento.executeUpdate() == 1;
         desconectarBD();
        } catch (SQLException ex) {   
            desconectarBD();
            System.err.println(ex);
          } catch (Exception ex){
              desconectarBD();
              System.err.println(ex); 
            }
        return rpta;
    }
    
     public boolean editarCliente(Cliente client){
     
          boolean rpta = false;
        try {
            //Nos conectamos
            conectarBD();
            //Busca los datos del profesor
            String call = "{CALL clienteActualizar(?,?,?,?,?,?,?,?,?)}";
            //Preparamos la sentencia
            obj_Procedimiento = conexion.prepareCall(call);
            //Identificacion
         obj_Procedimiento.setString(1, client.getidPersona());
         obj_Procedimiento.setString(2, client.getNombre());
         obj_Procedimiento.setString(3, client.getApellido1());
         obj_Procedimiento.setString(4, client.getApellido2());
         obj_Procedimiento.setString(5, client.getFecha());
         obj_Procedimiento.setString(6, client.getCorreo());
         obj_Procedimiento.setString(7, client.getDireccion());
          obj_Procedimiento.setString(9, client.getTelefono());
         obj_Procedimiento.setString(8, client.getCategoria());
               rpta = obj_Procedimiento.executeUpdate() ==1;
            desconectarBD();
        } catch (SQLException ex) {
            desconectarBD();
            System.err.println(ex);
        } catch (Exception ex) {
            desconectarBD();
            System.err.println(ex);

        }
        return rpta;
     
     
     }


     
     
public boolean eliminarCliente(String identificacion){
    boolean rpt= false;
        try {
            conectarBD();
            obj_Procedimiento=getConexion().prepareCall("{CALL clienteEliminar(?)}");
            obj_Procedimiento.setString(1, identificacion);
            rpt=obj_Procedimiento.executeUpdate()==1;
            desconectarBD();
        } catch (SQLException e) {
            
            System.err.println(e.getMessage());
        }
    
    return rpt;
    }
public Cliente buscarCliente(String identificacion){

        Cliente cliente = null;

        try {
            conectarBD();
            obj_Procedimiento = getConexion().prepareCall("{CALL clienteBuscar(?)}");
            obj_Procedimiento.setString(1, identificacion);
            rs = obj_Procedimiento.executeQuery();
            if (rs.next()) {
                cliente = new Cliente();
                cliente.setidPersona(rs.getString(1));
                cliente.setNombre(rs.getString(2));
                cliente.setApellido1(rs.getString(3));
                cliente.setApellido2(rs.getString(4));
                cliente.setFecha(rs.getString(5));
                cliente.setCorreo(rs.getString(6));
                cliente.setTelefono(rs.getString(7));
                cliente.setDireccion(rs.getString(8));
                cliente.setCategoria(rs.getString(9));
            }
            desconectarBD();
        } catch (SQLException e) {

            System.err.println(e.getMessage());
        }
        return cliente;
    }   // suave para ver si activo el microfono 
   // lo raro sk aqui si me parece activo 

    public void cargarReporteCategoria() {

        conectarBD();
        JasperReport reporte;
        JasperPrint reporte_view;
        try {
            URL in = this.getClass().getResource("/reportes/rptPersona");
            reporte = (JasperReport) JRLoader.loadObject(in);
            reporte_view = JasperFillManager.fillReport(reporte, null, getConexion());
            JasperViewer.viewReport(reporte_view, false); 
        } catch (JRException ex) {
            
            System.err.println(ex.toString());
        }

    }

}

