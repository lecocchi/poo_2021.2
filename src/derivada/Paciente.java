package derivada;
import base.Persona;

public class Paciente extends Persona{

	private int dni;
	private int numeroInternacion;
	
	public Paciente(int dni, int numeroInternacion, String nombre, String apellido) {
		super(nombre, apellido);
		this.dni = dni;
		this.numeroInternacion = numeroInternacion;
		
	}
	
	
	public int getDni() {
		return dni;
	}
	
	public int getNumeroInternacion() {
		return numeroInternacion;
	}


	public String getNombre() {
		return super.getNombre();
	}
	
	
}
