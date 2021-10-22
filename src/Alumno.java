
public class Alumno {

	private String nombre;
	private int dni;
	public static String apellido;

	public Alumno(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
