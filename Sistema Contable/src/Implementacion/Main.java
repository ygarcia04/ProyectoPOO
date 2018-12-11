package Implementacion;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import clases.Conexion;

public class Main {
	 public static void main(String[] args) throws SQLException {
	         Conexion con = new Conexion();
	            con.listarDatos();
//	            System.out.println("Result: "+con.getConnection());
	    }
}
