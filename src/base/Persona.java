package base;
public class Persona {
	private String nombre;
	private String apellido;
	
	protected Persona(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	protected String getNombre() {
		return nombre;
	}
	
}
