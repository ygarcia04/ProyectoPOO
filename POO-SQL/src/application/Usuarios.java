package application;

public class Usuarios {
	private int idUsuario;
	private String nombreUsuario;
	private String password;
	private int privilegios;
	
	public Usuarios() {}

	public Usuarios(int idUsuario, String nombreUsuario, String password, int privilegios) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.privilegios = privilegios;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getContrasena() {
		return password;
	}

	public void setContrasena(String password) {
		this.password = password;
	}

	public int getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(int privilegios) {
		this.privilegios = privilegios;
	}
}
