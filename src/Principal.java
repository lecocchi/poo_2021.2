
public class Principal {

	public static void main(String[] args) {
		TrianguloEquilatero triangulo = new TrianguloEquilatero(10,5);
		System.out.println("El lado del triangulo es: " + triangulo.getLado());
		System.out.println("La altura del triangulo es: " + triangulo.getAltura());
		System.out.println("El perimetro del triangulo es: " + triangulo.calcularPerimetro());
		System.out.println("La superficie del triangulo es: " + triangulo.calcularSuperficie());

		System.out.println("");

		Cuadrado cuadrado = new Cuadrado(10);
		System.out.println("El lado del cuadrado es: " + cuadrado.getLado());
		System.out.println("El perimetro del cuadrado es: " + cuadrado.calcularPerimetro());
		System.out.println("La superficie del cuadrado es: " + cuadrado.calcularSuperficie());

		System.out.println("");

		Rectangulo rectangulo = new Rectangulo(5,15);
		System.out.println("El lado1 de rectangulo es: " + rectangulo.getLado1());
		System.out.println("El lado2 de rectangulo es: " + rectangulo.getLado2());
		System.out.println("El perimetro del rectangulo es: " + rectangulo.calcularPerimetro());
		System.out.println("La superficie del rectangulo es: " + rectangulo.calcularSuperficie());


		System.out.println("");

		Circulo circulo = new Circulo(7);
		System.out.println("El radio del circulo es: " + circulo.getRadio());
		System.out.println("El perimetro del circulo es: " + circulo.calcularPerimetro());
		System.out.println("La superficie del circulo es: " + circulo.calcularSuperficie());

		System.out.println("");
		Vaso vaso = new Vaso(50, 15);
		System.out.println("El alto del vaso es: " + vaso.getAlto());
		System.out.println("El diametro del vaso es: " + vaso.getDiametro());
		System.out.println("El volumen del vaso es: " + vaso.calcularVolumen());
	}
}
