
public class Calculadora {

	// + sumar(numero1 : int, numero2 : int) : int
	public int sumar(int numero1, int numero2) {
		int resultado = numero1 + numero2;

		return resultado;
	}

	// + restar(numero1 : int, numero2 : int) : int

	public int restar(int numero1, int numero2) {
		int resultado = numero1 - numero2;

		return resultado;
	}

	// + multiplicar(numero1 : int, numero2 : int) : int

	public int multiplicar(int numero1, int numero2) {
		int resultado = numero1 * numero2;

		return resultado;
	}

	// + calcularMayor(numero1: int, numero2: int) : int

	public int calcularMayor(int numero1, int numero2) {

		if (numero1 > numero2) {
			return numero1;
		} else {
			return numero2;
		}

	}

	// + calcularMenor(numero1: int, numero2: int) : int

	public int calcularMenor(int numero1, int numero2) {

		if (numero1 < numero2) {
			return numero1;
		} else {
			return numero2;
		}

	}

}
