package derivada;

public class Cliente {
	private String nombre;
	private double saldo;
	private String red;

	public Cliente(String nombre, double saldo, String red) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.red = red;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getRed() {
		return red;
	}

}
