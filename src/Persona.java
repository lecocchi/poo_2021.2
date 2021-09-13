
public class Persona {

	private String nombre;
	private String apellido;

	Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}


	
	// getter  
	
	public String getNombre() {
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}
	
	public String obtenerNombreCompleto() {
		String nombreCompleto = this.nombre + " " + this.apellido;
		return nombreCompleto;
	}

}
