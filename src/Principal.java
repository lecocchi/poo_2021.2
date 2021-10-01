import derivada.Autobus;
import derivada.Taxi;

public class Principal {

	public static void main(String[] args) {
		Taxi taxiToyota = new Taxi(123, "abc123", "toyota", 4, "nafta");

		System.out.println(taxiToyota.getCantidadRuedas());
		System.out.println(taxiToyota.getModelo());
		System.out.println(taxiToyota.getNumeroLicencia());
		System.out.println(taxiToyota.getPatente());
		System.out.println(taxiToyota.getTipoCombustible());

		taxiToyota.frenar();
		taxiToyota.arrancar();
		taxiToyota.abrirPuerta();
		
		
		Autobus autobusMercedes = new Autobus(50, "bcd789", "mercedes", 6, "gasoil");
		
		System.out.println(autobusMercedes.getCantidadRuedas());
		System.out.println(autobusMercedes.getModelo());
		System.out.println(autobusMercedes.getNumeroAsientos());
		System.out.println(autobusMercedes.getPatente());
		System.out.println(autobusMercedes.getTipoCombustible());

		autobusMercedes.frenar();
		autobusMercedes.arrancar();
		autobusMercedes.abrirPuerta();

	}

}
