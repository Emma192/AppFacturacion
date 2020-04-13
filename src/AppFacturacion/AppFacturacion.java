
package AppFacturacion;

import Clases.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import views.frmPrincipal;


/**
 *
 * @author emmanuel
 */
public class AppFacturacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        
        frmPrincipal pri = new frmPrincipal();
        pri.setVisible(true);
        
       Conexion.setServidor(1);
       Conexion c  = new Conexion();
       c.conectarBD();
       c.desconectarBD();
       
       
        
        
        
//      
//       try {
//            Connection con;
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection("jdbc:mysql://localhost/dbfacturacion","root","root");
//            System.out.println("conectado");
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(AppFacturacion.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (SQLException ex) {
//            Logger.getLogger(AppFacturacion.class.getName()).log(Level.SEVERE, null, ex);
//        } 
    }
    
}
