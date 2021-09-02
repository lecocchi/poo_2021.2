
public class Persona {

	// + esMayorDeEdad(edad: int) : String

	public String esMayorDeEdad(int edad) {

		String mensaje;

		if (edad > 18) {
			mensaje = "Es mayor de edad";
		} else {
			mensaje = "No es mayor de edad";
		}

		return mensaje;
	}

	// + calcularEdad(año : int) : int

	public int calcularEdad(int año) {

		int edadPersona = 2021 - año;

		return edadPersona;

	}

}
