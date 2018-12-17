package application;
import java.awt.HeadlessException;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class ControlAcceso implements Initializable{
	@FXML private TextField txtCuenta;
	@FXML private TextField txtPassword;	
	@FXML private Button btnAcceder;
	@FXML private Button btnCancelar;
		  private String idUsuario;
		  private String password;
		  private boolean existe = true;
		  private Conexion conexion = new Conexion();
	
	private Main main;
	public Main getMain() {
		return main;
	}
	
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	public void salir() {
		System.exit(0);
	}
	@FXML
	public void abrirPrincipal() throws HeadlessException, SQLException {
		idUsuario = txtCuenta.getText();
		password = txtPassword.getText();
		
		boolean v = conexion.VerificarUsuario(idUsuario, password);
		
		if (v!=false) {
			main.abrirPrincipa();
			main.getPrincipal().close();		
		}else {
			JOptionPane.showMessageDialog(null,"Datos inválidos");
		}
        			
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}	
}	
