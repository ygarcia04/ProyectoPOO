package application;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.*;

public class AsientoContable extends Conexion implements Initializable, KeyListener{
	@FXML private TextField txtFecha;
	@FXML private TextField txtId;
	@FXML private TextField txtDebe;
	@FXML private TextField txtDebe1;
	@FXML private TextField txtHaber;
	@FXML private Button btnGuardar;
	@FXML private Button btnCuenta;
	@FXML private Button btnSubCuenta;
	@FXML private Button btnAsiento;
	@FXML private Button btnSalir;
	@FXML private ComboBox<String> cmbAsiento1;
	private ObservableList<String> datos = FXCollections.observableArrayList();
	@FXML private ComboBox<String>cmbAsiento2;
	private ObservableList<String> datos2 = FXCollections.observableArrayList();
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
		if (debe == haber) {
			GuardarDatos("");
		}else {
			JOptionPane.showMessageDialog(null,"Los datos no coinciden");
		}
	
	}
	
	@FXML
	public void Cuentas() {
		cmbAsiento1.getSelectionModel().getSelectedItem().toString();
	}
	
	@FXML
	public void Cuentas2() {
		cmbAsiento2.getSelectionModel().getSelectedItem().toString();
	}
	
	@FXML
	public void keyReleased(KeyEvent e) {
		
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
		try {
			cmbAsiento1.setPromptText("Elige una cuenta");
			cmbAsiento1.setItems(listarCuentas());
			cmbAsiento2.setPromptText("Elige una cuenta");
			cmbAsiento2.setItems(listarCuentas());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void keyPressed(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(java.awt.event.KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(java.awt.event.KeyEvent arg0) {}

	public void init() { 
		//txtHaber.setEventDispatcher(haber);
	    //txtDebe.addKeyListener(this); //y aqui esta lo importante,  
		//le decimos que nuestro textbox q va a escuchar el teclado 
		    
		    } 
	protected void displayInfo(KeyEvent e){ 
	    //int keyCode = e.getKeyCode();  //obtenemos el codigo de la tecla 
	    //String keyText = e.getKeyText(keyCode);  //luego el caracter 
	    //txtDebe1.setText(keyText);  //lo pintamos en el campo de texto de abajo 
	    } 
}

