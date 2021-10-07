package base;

import derivada.Cliente;

public abstract class CajeroAutomatico {

	public abstract String extraerDinero(Cliente cliente, double montoAExtraer);

	public abstract String transferir(Cliente clienteOrigen, Cliente clienteDestino, double montoATransferir);

}