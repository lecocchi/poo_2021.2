package derivada;

import base.Animal;

public class Pez extends Animal {

	private String color;
	private double peso;

	public Pez( String color, double peso, int edad) {
		super(edad);
		this.color = color;
		this.peso = peso;
	}
	
	public void nadar() {
		System.out.println("El pez está nadando");
	}

	public String getColor() {
		return color;
	}

	public double getPeso() {
		return peso;
	}

	public int getEdad() {
		return edad;
	}

}
