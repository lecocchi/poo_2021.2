
public class FiguraGeometrica {

	String tipo;

	public double calcularPerimetro(Circulo circulo) {
		double perimetro = 3.14 * circulo.diametro;

		return perimetro;
	}

	public double calcularPerimetro(Cuadrado cuadrado) {
		double perimetro = cuadrado.lado * 4;

		return perimetro;
	}

	public double calcularPerimetro(Rectangulo rectangulo) {
		double perimetro = rectangulo.lado1 * 2 + rectangulo.lado2 * 2;

		return perimetro;
	}

}
