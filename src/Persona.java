
public class Persona {
	
	private String nombre;
	private String apellido;
	private Integer edad;
	
	public Persona(String nombre, String apellido, int edad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	
	public Integer getEdad() {
		return edad;
	}
	
}
