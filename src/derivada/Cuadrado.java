package derivada;

import base.Figura;

public class Cuadrado extends Figura{
	
	private double lado;
	
	public Cuadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calcularPerimetro() {
		double perimetro = lado * 4;
		return perimetro;
	}

	@Override
	public double calcularSuperficie() {
		double superficie = lado * lado;
		return superficie;
	}
	
	public double getLado() {
		return lado;
	}
	
}
