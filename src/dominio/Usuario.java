package dominio;

public class Usuario {
	
	private String email;
	private String contrasena;
	
	public Usuario(String email, String contrasena) {
		this.email = email;
		this.contrasena = contrasena;
	}
	
	
	public String getEmail() {
		return email;
	}
	
	public String getContrasena() {
		return contrasena;
	}

}
