import base.Animal;

public class Tigre extends Animal{

	private String colorPelo;


	public Tigre(String colorPelo, int edad) {
		this.colorPelo = colorPelo;
		this.edad = edad;
	}

	public void dormir() {
		System.out.println("El tigre esta durmiendo");
	}

	public void comer() {
		System.out.println("El tigre esta comiendo");
	}
	
	@Override
	public Integer getEdad() {
		return edad;
	}
}
