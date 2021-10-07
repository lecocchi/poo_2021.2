package derivada;

import base.CajeroAutomatico;

public class CajeroAutomaticoBanelco extends CajeroAutomatico{
	
	private double saldo;
	
	public CajeroAutomaticoBanelco(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String extraerDinero(Cliente cliente, double montoAExtraer) {
		if (saldo >= montoAExtraer) {

			if (cliente.getRed().equalsIgnoreCase("LINK")) {
				cliente.setSaldo(cliente.getSaldo() + montoAExtraer * 0.85);
			} else {
				cliente.setSaldo(cliente.getSaldo() + montoAExtraer);
			}
			
			saldo = saldo - montoAExtraer;

			return "La operación se ha realizado con éxito";

		} else {
			return "El cajero no tiene saldo disponible";
		}
	}

	@Override
	public String transferir(Cliente clienteOrigen, Cliente clienteDestino, double montoATransferir) {
		
		if (clienteOrigen.getRed().equalsIgnoreCase("BANELCO") && clienteDestino.getRed().equalsIgnoreCase("BANELCO")) {
			if (clienteOrigen.getSaldo() >= montoATransferir) {
				clienteDestino.setSaldo(clienteDestino.getSaldo() + montoATransferir);

				return "La transferencia se ha realizado con éxito";
			} else {
				return "El cliente de origen no tiene saldo suficiente para realizar la transferencia";
			}
		} else {
			return "La red del cliente origen y/o cliente destino no son BANELCO";
		}
	}

}
