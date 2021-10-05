package derivada;

import base.Figura;

public class Circulo extends Figura {

	private double radio;

	public Circulo(double radio) {
		this.radio = radio;
	}

	@Override
	public double calcularPerimetro() {
		double diametro = radio * 2;
		double perimetro = Math.PI * diametro;

		return perimetro;
	}

	@Override
	public double calcularSuperficie() {
		// https://www.tutorialspoint.com/java/lang/math_pow.htm
		double superficie = Math.PI * Math.pow(radio, 2);

		return superficie;
	}

	public double getRadio() {
		return radio;
	}

}
