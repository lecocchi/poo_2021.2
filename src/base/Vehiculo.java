package base;

public class Vehiculo {

	protected String patente;
	protected String modelo;
	protected int cantidadRuedas;
	protected String tipoCombustible;
	
	
	protected Vehiculo(String patente, String modelo, int cantidadRuedas, String tipoCombustible) {
		this.patente = patente;
		this.modelo = modelo;
		this.cantidadRuedas = cantidadRuedas;
		this.tipoCombustible = tipoCombustible;
	}

	protected void abrirPuerta() {
		System.out.println("Se está abriendo la puerta");
	}
}
