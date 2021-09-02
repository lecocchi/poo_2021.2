import javax.swing.JOptionPane;

public class Monitor {
	
	String marca;
	
	
	
	// + imprimir() : void
	
	public void imprimir() {		
		System.out.println("Hola Mundo");
	}
	
	// + imprimirNombre(nombre: String) : void
	
	public void imprimirNombre(String nombre) {
		System.out.println("El nombre es: " + nombre);
	}
	
	// + imprimirNombreYApellido(nombre: String, apellido: String) : String
	
	public String imprimirNombreYApellido(String nombre, String apellido) {
	
		String nombreCompleto = nombre + " " + apellido;
		
		return nombreCompleto;
		
	}
	
	

}
