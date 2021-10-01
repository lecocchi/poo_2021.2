package derivada;

import base.Vehiculo;

public class Autobus extends Vehiculo{
	
	private int numeroAsientos;
	
	public Autobus(int numeroAsientos, String patente, String modelo, int cantidadRuedas, String tipoCombustible) {
		super(patente, modelo, cantidadRuedas, tipoCombustible);
		this.numeroAsientos = numeroAsientos;
	}
	
	public void frenar() {
		System.out.println("El autobús frenó");
	}
	
	public void arrancar() {
		System.out.println("El autobús arrancó");
	
	}
	
	public void abrirPuerta() {
		super.abrirPuerta();
	}
	
	public String getPatente() {
		return patente;
	}

	public int getNumeroAsientos() {
		return numeroAsientos;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public int getCantidadRuedas() {
		return cantidadRuedas;
	}
	
	public String getTipoCombustible() {
		return tipoCombustible;
	}

}
