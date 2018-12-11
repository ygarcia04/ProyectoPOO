package clases;

public class Cuenta {
	private int idCuenta;
	private String nombreCuenta;
	
	public Cuenta() {}
	
	public Cuenta(int idCuenta, String nombreCuenta) {
		super();
		this.idCuenta = idCuenta;
		this.nombreCuenta = nombreCuenta;
	}

	public int getIdCuenta() {
		return idCuenta;
	}

	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}

	public String getNombreCuenta() {
		return nombreCuenta;
	}

	public void setNombreCuenta(String nombreCuenta) {
		this.nombreCuenta = nombreCuenta;
	}

}
