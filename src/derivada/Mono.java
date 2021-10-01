package derivada;

import base.Animal;

public class Mono extends Animal{
	
	private String color;
	private String tipoAlimentacion;
	private int cantidadPatas;
	
	public Mono(String color, String tipoAlimentacion, int cantidadPatas, int edad) {
		super(edad);
		this.color = color;
		this.tipoAlimentacion = tipoAlimentacion;
		this.cantidadPatas = cantidadPatas;
	}
	
	public void trepar() {
		System.out.println("El mono está trepando");
	}

	public String getColor() {
		return color;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public int getCantidadPatas() {
		return cantidadPatas;
	}
	
	public int getEdad() {
		return edad;
	}

}
