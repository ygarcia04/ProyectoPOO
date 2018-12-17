package application;
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
		
	private Stage principal;
	private Stage interfasControl;
	private ControlAcceso controlAcceso;
		
	public void setPrincipal(Stage principal) {
		this.principal = principal;
	}
		
	public Stage getPrincipal() {
		return principal;
	}



	public void VentanaPrincipal(Stage acceso) {
		principal=acceso;
		interfasControl=acceso;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Acceso.fxml"));
			acceso.initStyle(StageStyle.UNDECORATED); 
			AnchorPane accesoUsuario = (AnchorPane)loader.load();
			Scene accesoPas = new Scene(accesoUsuario,300,130);
			accesoPas.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			acceso.setScene(accesoPas);
			controlAcceso = loader.getController();
			controlAcceso.setMain(this);
			acceso.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public void abrirPrincipal() {
		try {
			interfasControl= new Stage();
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("Scene.fxml"));
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root);
			interfasControl.setTitle("POO-SQL");
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			interfasControl.setScene(scene);
		} catch (Exception e) {
			e.printStackTrace();
		}
		interfasControl.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		VentanaPrincipal(primaryStage);
		
	}
}
