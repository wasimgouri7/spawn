/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spawn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Sagar
 */
public class Conn {
    private Connection con=null;
    public Conn(){
        
    }
    public Connection openConnection()
    {
          try{
        Class.forName("com.mysql.jdbc.Driver");  
  
    con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/rudhrahardware","root","Spawn@123");
        }catch(Exception e){
            JOptionPane.showMessageDialog (null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return con;
    }
    public void closeConnection1()
    {
        try{
        con.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog (null, e.toString(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
