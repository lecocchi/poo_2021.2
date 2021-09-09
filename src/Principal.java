
public class Principal {

	public static void main(String[] args) {
		
		double perimetro;
		
		
		FiguraGeometrica figura = new FiguraGeometrica();
		
		Circulo circulo1 = new Circulo();
		circulo1.diametro = 10;
		
		perimetro = figura.calcularPerimetro(circulo1);
		System.out.println(perimetro);
		
		Circulo circulo2 = new Circulo();
		circulo2.diametro = 100;
		
		perimetro = figura.calcularPerimetro(circulo2);
		System.out.println(perimetro);
		
		
		Cuadrado cuadrado1 = new Cuadrado();
		cuadrado1.lado = 9;
		
		
		perimetro = figura.calcularPerimetro(cuadrado1);
		System.out.println(perimetro);
		
		
		Rectangulo rectangulo1 = new Rectangulo();
		rectangulo1.lado1 = 10;
		rectangulo1.lado2 = 20;
		
		perimetro = figura.calcularPerimetro(rectangulo1);
		System.out.println(perimetro);

	}

}
