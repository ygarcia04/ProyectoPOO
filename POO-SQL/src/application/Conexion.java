package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Conexion {
	private static String user="postgres";
	private static String pass="postgres";
	private static java.sql.Connection conexion;
	private static String urlDatabase =  "jdbc:postgresql://localhost:5432/Contabilidad";
	private static String driver="org.postgresql.Driver";

	public java.sql.Connection getConnection() throws Exception{
		try {
			Class.forName(driver);
			conexion = (Connection) DriverManager.getConnection(urlDatabase, user, pass);
			
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println(e.getMessage());
		}
    //cargar el driver manualmente
    return conexion;
    
    }
	
	public void listarDatos(String query) throws SQLException {
		try {
            Statement st = getConnection().createStatement(); // Objeto Statement
            
            ResultSet rs = st.executeQuery(query); // Objeto Resulset
            
            // Recorre todos los elemento de la tabla
            while(rs.next()){
                System.out.println(rs.getString(1)+rs.getString(2)+ rs.getString(3)); // Obtener valor
            }
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
	
	public void GuardarDatos(String query) throws SQLException{
		try {
            Statement st = getConnection().createStatement(); // Objeto Statement    
            st.executeQuery(query); // Objeto Resulset
            System.out.println("Registrado correctamente");
		 } catch(SQLException e){
	            JOptionPane.showMessageDialog(null,"El usuario ya existe");

	        } catch(ClassNotFoundException e){
	            JOptionPane.showMessageDialog(null,"Error inesperado");
	    } 
		
		catch (Exception e) {
		} 
	}
	
	public boolean VerificarUsuario(String idUsuario, String password) throws SQLException{
		boolean existe = false;
		
		try {
            Statement st = getConnection().createStatement(); // Objeto Statement 
        	ResultSet rs = st.executeQuery("select * from public.\"Usuarios\" where \"idUsuario\" = '"+idUsuario+"' and password = '"+password+"'"); // Objeto Resulset
            
            while(rs.next()){
            	if(rs.getRow()>0) 
            		existe=true;
            	else
            		existe=false;       	
            }
            
        } catch (Exception ex) {
            System.out.println("error aqui en verificar");
        }
		return existe;
	}
}

