package application;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AsientoContable extends Conexion implements Initializable{
	@FXML private TextField txtFecha;
	@FXML private TextField txtId;
	@FXML private TextField txtDebe;
	@FXML private TextField txtHaber;
	@FXML private Button btnGuardar;
	@FXML private Button btnCuenta;
	@FXML private Button btnSubCuenta;
	@FXML private Button btnAsiento;
	@FXML private Button btnSalir;
	@FXML private ComboBox cmbAsiento1;
	@FXML private ComboBox cmbAsiento2;
		  private String debe;
		  private String haber;
		  private String fecha;
		  private String id;
	
	private Main main;
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	
	@FXML
	public void guardar() throws SQLException {
		fecha = txtFecha.getText();
		id = txtId.getText();
		haber = txtHaber.getText();		
		debe = txtDebe.getText();
		//cmbAsiento1 = 
	}
	
	@FXML
	public void Cuentas() throws SQLException {
		cmbAsiento1 = (ComboBox) listarCuentas();
		cmbAsiento1.getSelectionModel().getSelectedItem();
		//cmbAsiento1 = 
	}
	
	@FXML
	public void agregarCuenta() {}
		/*Stage interfasControl= null;
		try {
			interfasControl= new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("AgregarCuenta.fxml"));
			AnchorPane ventana = (AnchorPane)loader.load();
			Scene scene = new Scene(ventana);
			interfasControl.setTitle("POO-SQL");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			interfasControl.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
		interfasControl.show();	
		
		}*/
	
	@FXML
	public void agregarSubCuenta() {}/*
		Stage interfasControl2= null;
		try {
			interfasControl2= new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("AgregarSubCuenta.fxml"));
			AnchorPane ventana = (AnchorPane)loader.load();
			Scene scene = new Scene(ventana);
			interfasControl2.setTitle("POO-SQL");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			interfasControl2.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
		interfasControl2.show();			
	}*/
	
	@FXML
	public void agregarAsiento() {
		txtFecha.setText(null);
		txtId.setText(null);
		txtDebe.setText(null);
		txtHaber.setText(null);
		
	}
	
	@FXML
	public void salir() {
		System.exit(0);
	}
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
}

