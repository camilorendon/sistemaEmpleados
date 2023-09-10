/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.usuarios;


public class usuariosController {
     Connection con;
     conexion cn = new conexion();
     PreparedStatement ps;
     ResultSet rs;
     
     public usuarios login(String user, String pass){
         usuarios us= new usuarios();
         String sql = "select * from usuarios where usuario='"+user+" 'and password='"+pass+"'";
         try{
             con=cn.conectar();
             ps=con.prepareStatement(sql);
             rs=ps.executeQuery();
             while(rs.next()){
                 us.setIdUser(rs.getInt(1));
                 us.setNombre(rs.getString(2));
                 us.setUsuario(rs.getString(3));
                 us.setPassword(rs.getString(4));
             }
         }catch(Exception e) {
             JOptionPane.showConfirmDialog(null, e);
         }
          return us;
     }
}
