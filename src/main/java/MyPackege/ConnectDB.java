/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyPackege;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sanchit
 */
public class ConnectDB {
    public static void main(String args[])
    {
        try {
            String user="root";
            String password="1234";
            String url="jdbc:mysql://localhost:3306/CarInfodb";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn=DriverManager.getConnection(url,user,password);
            if(conn!=null)
            {
            System.out.println("Success");
            }
            else
            {
            System.out.println("Fail");
            }
            
        } 
        
        catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
}
