package clases;

public class Usuario {
	private int idUsuario;
	private String nombreUsuario;
	private String contrasena;
	private int privilegios;
	
	public Usuario() {}

	public Usuario(int idUsuario, String nombreUsuario, String contrasena, int privilegios) {
		super();
		this.idUsuario = idUsuario;
		this.nombreUsuario = nombreUsuario;
		this.contrasena = contrasena;
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
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public int getPrivilegios() {
		return privilegios;
	}

	public void setPrivilegios(int privilegios) {
		this.privilegios = privilegios;
	}
	
}
