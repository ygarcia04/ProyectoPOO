package application;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Registro extends Conexion implements Initializable{
	@FXML private TextField txtNombre;
	@FXML private TextField txtPassword;
	@FXML private TextField txtPrivilegio;
	@FXML private TextField txtidUsuario;
	@FXML private Button btnGuardar;
	@FXML private Button btnMostrar;
	@FXML private Button btnNuevo;
	@FXML private TextArea txtaUsuarios;
		  private String nombre;
		  private String password;
		  private String idUsuario;
		  private String privilegio;
		  
	@FXML
	public void guardar() throws SQLException {
		nombre = txtNombre.getText();
		password = txtPassword.getText();
		idUsuario = txtidUsuario.getText();
		privilegio = txtPrivilegio.getText();
		GuardarDatos("insert into public.\"Usuarios\"(\"idUsuario\", \"nombreUsuario\", \"password\", \"privilegio\") \r\n" + 
        		"values('"+idUsuario+"', '"+nombre+"', '"+password+"', '"+privilegio+"')");
		JOptionPane.showMessageDialog(null,"Registro Exitoso");
		}
	
	@FXML
	public void mostrar() throws SQLException {
		//txtaUsuarios.appendText(conexion.listarDatos());
	}

	@FXML
	public void nuevo() {
		txtNombre.setText(null);
		txtPassword.setText(null);
		txtidUsuario.setText(null);
		txtPrivilegio.setText(null);
	}
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
