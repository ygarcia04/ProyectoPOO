package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Conexion {
	private String usuario="postgres", password="postgres";
	private Connection conn = null;
	private String urlDatabase =  "jdbc:postgresql://localhost:5432/Contabilidad";
	
	
	public void listarDatos() {

        Connection c = null;
        Statement stmt = null;

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager.getConnection(urlDatabase, usuario, password);
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            stmt = c.createStatement();
//            ResultSet rs = stmt.executeQuery( "SELECT(id,pass,type,name)as datos FROM USERS;" );
            ResultSet rs = stmt.executeQuery( "SELECT * FROM USERS;" );
//            ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY WHERE NAME = 'Teddy'" );
//            ResultSet rs = stmt.executeQuery("SELECT (name) as name, age FROM USERS");
            int i =0;
            while (rs.next()) {
                i++;
                System.out.println("Usuario #: "+i);
                int id = rs.getInt("id");
                String pass = rs.getString("pass");
                int  type = rs.getInt("type");
                String name = rs.getString ("name");
                String fecha = rs.getString ("fecha");

                System.out.println("NAME:       " + name);
                System.out.println("ID:         " + id);
                System.out.println("TYPE:       " + type);
                System.out.println("PASSWORD:   " + pass);
                System.out.println("FECHA:       " + fecha);
                System.out.println();
            }

            rs.close();
            stmt.close();
            c.close();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        System.out.println("Operation done successfully");
    }
	
	
	
	
	
	
	
	/*
		public Connection getConnection(){
				try {
					Class.forName("org.postgresql.Driver");
					conn = (Connection) DriverManager.getConnection(urlDatabase, usuario, password);
					
					
				} catch (ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
				}
	        //cargar el driver manualmente
	        return conn;
	        
		}*/
}
