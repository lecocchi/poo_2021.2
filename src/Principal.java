
public class Principal {

	public static void main(String[] args) {

		/*** Ejemplo clase Monitor ***/

		Monitor lg = new Monitor();

		lg.imprimir();
		lg.imprimirNombre("Leandro");

		String nombreCompleto = lg.imprimirNombreYApellido("Leandro", "Cocchi");
		System.out.println(nombreCompleto);

		/*** Ejemplo clase Persona ***/

		Persona magali = new Persona();

		String mensaje = magali.esMayorDeEdad(18);
		System.out.println(mensaje);

		int edad = magali.calcularEdad(2003);
		System.out.println(edad);

		/*** Ejemplo clase Calculadora ***/

		Calculadora casio = new Calculadora();
		System.out.println(casio.sumar(10, 5));
		System.out.println(casio.restar(10, 5));
		System.out.println(casio.multiplicar(10, 5));
		System.out.println(casio.calcularMayor(10, 5));
		System.out.println(casio.calcularMenor(10, 5));

		/*** Ejemplo clase Programador ***/

		Programador andrey = new Programador();
		andrey.repetirMensaje("Hola Mundo", 2);

		// Hago dos ejemplos para ver si me devuelve true o false
		System.out.println(andrey.sePuedeDividir(10, 0));
		System.out.println(andrey.sePuedeDividir(10, 10));

	}

}
