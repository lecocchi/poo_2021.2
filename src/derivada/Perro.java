package derivada;

import base.Animal;

public class Perro extends Animal {
	private String tipoAlimentacion;
	private int cantidadPatas;

	public Perro(String tipoAlimentacion, int cantidadPatas, int edad) {
		super(edad);
		this.tipoAlimentacion = tipoAlimentacion;
		this.cantidadPatas = cantidadPatas;
	}

	public void ladrar() {
		System.out.println("El perro está ladrando");
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
