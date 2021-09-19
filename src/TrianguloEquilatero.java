
public class TrianguloEquilatero {

	private double lado;
	private double altura;
	
	
	public TrianguloEquilatero(double lado, double altura) {
		this.lado = lado;
		this.altura = altura;
	}

	
	public double getLado() {
		return lado;
	}
	
	public double getAltura() {
		return altura;
	}

	
	public double calcularPerimetro() {
		double perimetro = lado * 3;
		
		return perimetro;
	}

	public double calcularSuperficie() {
		double superficie = lado * altura / 2;

		return superficie;
	}

}
