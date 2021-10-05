package derivada;

import base.Figura;

public class Rectangulo extends Figura {

	private double alto;
	private double ancho;

	public Rectangulo(double alto, double ancho) {
		this.alto = alto;
		this.ancho = ancho;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = alto * 2 + ancho * 2;
		return perimetro;
	}

	@Override
	public double calcularSuperficie() {
		double superficie = alto * ancho;
		return superficie;
	}

	public double getAlto() {
		return alto;
	}

	public double getAncho() {
		return ancho;
	}

}
