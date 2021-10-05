package derivada;

import base.Figura;

public class TrianguloEquilatero extends Figura {

	private double lado;

	public TrianguloEquilatero(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = lado * 3;

		return perimetro;
	}

	@Override
	public double calcularSuperficie() {
		// https://www.tutorialspoint.com/java/lang/math_sqrt.htm
		// https://www.tutorialspoint.com/java/lang/math_pow.htm

		double altura = Math.sqrt(Math.pow(2, lado) - Math.pow(2, lado / 2));
		double superficie = lado * altura / 2;

		return superficie;
	}

	public double getLado() {
		return lado;
	}

}
