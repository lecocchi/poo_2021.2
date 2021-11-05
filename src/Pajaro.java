import base.Animal;

public class Pajaro extends Animal{
	
	private double alturaMaxima;
	
	
	public Pajaro(double alturaMaxima, int edad) {
		this.alturaMaxima = alturaMaxima;
		this.edad = edad;
	}
	
	public void dormir() {
		System.out.println("El pajaro esta durmiendo");
	}

	public void comer() {
		System.out.println("El pajaro esta comiendo");
	}
	
	@Override
	public Integer getEdad() {
		return edad;
	}

}
