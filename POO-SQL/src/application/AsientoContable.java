package application;
import javafx.fxml.FXML;
public class AsientoContable {
	private Main main;
	public Main getMain() {
		return main;
	}
	public void setMain(Main main) {
		this.main = main;
	}
	@FXML
	public void esenaAsientoContble(){
		main.esenaAsientoContable();
	}
}

