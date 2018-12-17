package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ControlPrincipal implements Initializable{
	@FXML private TextField txtCuenta;
	@FXML private TextField txtNombre;
	@FXML private TextField txtApellido;
	@FXML private TextField txtEdad;
	@FXML private TextField txtIdentidad;
	@FXML private TextField txtPromedio;
	
	@FXML private RadioButton rbtFemenino;
	@FXML private RadioButton rbtMasculino;
	
	@FXML private CheckBox chkClase1;
	@FXML private CheckBox chkClase2;
	@FXML private CheckBox chkClase3;
	
	@FXML private TextArea txtAResultado;
	
	@FXML private Button btnGuardar;
	@FXML private Button btnActualizar;
	@FXML private Button btnEliminar;
	@FXML private Button btncargarDatos;
	
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
	public void esenaAsientoContble(){
		main.esenaAsientoContable();
	}
	@FXML
	public void salir() {
		System.exit(0);
	}

}	
