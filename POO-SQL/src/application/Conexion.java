package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

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
            
            ResultSet rs = st.executeQuery(query);//("select * from public.\"Usuarios\"")); // Objeto Resulset
            
            // Recorre todos los elemento de la tabla
            while(rs.next()){
                System.out.println(rs.getString(1)+" "+rs.getString(2)); // Obtener valor
            }
            
        } catch (Exception ex) {
            System.out.println("Error");
        }
    }
	
	public void GuardarDatos(String query) throws SQLException{
		try {
            Statement st = getConnection().createStatement(); // Objeto Statement    
            st.executeQuery(query); // Objeto Resulset
            	JOptionPane.showMessageDialog(null,"Registrado correctamente");
		 } catch(SQLException e){
	     } catch(ClassNotFoundException e){
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
            	if(rs.getRow()>0)//Obtiene el numero de filas q encontro 
            		existe=true;
            	else
            		existe=false;       	
            }
            
        } catch (Exception ex) {
            System.out.println("error aqui en verificar");
        }
		return existe;
	}
	public ObservableList<String> listarCuentas() throws SQLException{
		ObservableList<String> datos = FXCollections.observableArrayList();
		
		try {
            Statement st = getConnection().createStatement(); // Objeto Statement 
        	ResultSet rs = st.executeQuery("select * from public.\"Cuenta\" order by idcuenta asc;"); // Objeto Resulset           
        	while(rs.next()){
        		datos.addAll(rs.getString(1)+" "+rs.getString(2));
        	}
		} catch (Exception ex) {
            System.out.println("error aqui en verificar");
        }
		
		return datos;
	}
}

