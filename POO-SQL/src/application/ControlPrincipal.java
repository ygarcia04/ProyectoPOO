package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ControlPrincipal implements Initializable{
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	@FXML private Button btncargarDatos;
	@FXML private Button btnAsiento;
	@FXML private Button btnSalir;
	@FXML private Button btnCuenta;
	
	private Main main;
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	public void initialize(URL location, ResourceBundle arg1) {	
	}
	@FXML
	public void escenaAsientoContable(){
		Stage interfasControl = null;
		try {
			interfasControl = new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("AsientoContable.fxml"));
            AnchorPane ventanaDos = (AnchorPane) loader.load();
            Scene scene = new Scene(ventanaDos);
            interfasControl.setTitle("POO-SQL");
            scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
            interfasControl.setScene(scene);			
			} catch(Exception e) {
				e.printStackTrace();
			}	
		interfasControl.show();
	}
	@FXML
	public void salir() {
		System.exit(0);
	}
	
	@FXML
	public void Usuarios() {
		Stage interfasControl2= null;
		try {
			interfasControl2= new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("NuevosUsuarios.fxml"));
			AnchorPane ventana = (AnchorPane)loader.load();
			Scene scene = new Scene(ventana);
			interfasControl2.setTitle("POO-SQL");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			interfasControl2.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
		interfasControl2.show();	
		
		}
}	
