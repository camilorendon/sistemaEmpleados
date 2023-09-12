
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.cargo;


public class cargoController {
     Connection con;
     conexion cn = new conexion();
     PreparedStatement ps;
     ResultSet rs;
     
     public boolean insertar(cargo c){
         String sql="insert into cargos  (nombre_cargo) value (?)";
         try{
             con = cn.conectar();
             ps=con.prepareStatement(sql);
             ps.setString(1, c.getNombreCargo());
             int n=ps.executeUpdate();
             if(n!=0){
                 return true;
             }else{
                 return false;
             }
         }catch(Exception e) {
             JOptionPane.showConfirmDialog(null, e);
             return false;
         }
     }
}
