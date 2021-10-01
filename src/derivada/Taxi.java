package derivada;

import base.Vehiculo;

public class Taxi extends Vehiculo {

	private int numeroLicencia;

	public Taxi(int numeroLicencia, String patente, String modelo, int cantidadRuedas, String tipoCombustible) {
		super(patente, modelo, cantidadRuedas, tipoCombustible);
		this.numeroLicencia = numeroLicencia;
	}

	public void frenar() {
		System.out.println("El taxi frenó");
	}

	public void arrancar() {
		System.out.println("El taxi arrancó");

	}

	public void abrirPuerta() {
		super.abrirPuerta();
	}

	public String getPatente() {
		return patente;
	}

	public int getNumeroLicencia() {
		return numeroLicencia;
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
