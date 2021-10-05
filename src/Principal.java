import derivada.Circulo;
import derivada.Cuadrado;
import derivada.Rectangulo;
import derivada.TrianguloEquilatero;

public class Principal {

	public static void main(String[] args) {
		
		// Circulo
		System.out.println("");
		System.out.println("Círculo ..............");
		Circulo circulo = new Circulo(10);
		
		System.out.println("El perímetro del círculo es: " + circulo.calcularPerimetro());
		System.out.println("La superficie del círculo es: " + circulo.calcularSuperficie());
		System.out.println("El radio del círculo es: " + circulo.getRadio());

		
		// Rectangulo
		System.out.println("");
		System.out.println("Rectángulo ..............");
		Rectangulo rectangulo = new Rectangulo(20, 30);
		
		System.out.println("El alto del rectángulo es: " + rectangulo.getAlto());
		System.out.println("El ancho del rectángulo es: " + rectangulo.getAlto());
		System.out.println("El perímetro del rectángulo es: " + rectangulo.calcularPerimetro());
		System.out.println("La superficie del rectángulo es: " + rectangulo.calcularSuperficie());
		
		
		// Cuadrado
		System.out.println("");
		System.out.println("Cuadrado ..............");
		Cuadrado cuadrado = new Cuadrado(15);
		
		System.out.println("El lado del cuadrado es: " + cuadrado.getLado());
		System.out.println("El perímetro del cuadrado es: " + cuadrado.calcularPerimetro());
		System.out.println("La superficie del cuadrado es: " + cuadrado.calcularSuperficie());
		
		
		// TrianguloEquilatero
		System.out.println("");
		System.out.println("Triángulo Equilátero ..............");
		TrianguloEquilatero trianguloEquilatero = new TrianguloEquilatero(18);
		
		System.out.println("El lado del triángulo es: " + trianguloEquilatero.getLado());
		System.out.println("El perímetro del triángulo es: " + trianguloEquilatero.calcularPerimetro());
		System.out.println("La superficie del triángulo es: " + trianguloEquilatero.calcularSuperficie());
		
	}

}
