
public class Programador {

	// + repetirMensaje(mensaje: String, cantidadRepeticiones: int): void

	public void repetirMensaje(String mensaje, int cantidadRepeticiones) {

		for (int i = 1; i <= cantidadRepeticiones; i++) {
			System.out.println(mensaje);
		}

	}

	// + sePuedeDividir (numerador: int, denominador: int) : boolean

	public boolean sePuedeDividir(int numerador, int denominador) {

		if (denominador == 0) {
			return false;
		} else {
			return true;
		}
	}

}
