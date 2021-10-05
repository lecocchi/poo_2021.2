package derivada;

import java.util.Random;
import java.util.UUID;

import base.ProveedorGrua;

public class ProveedorAca extends ProveedorGrua {

	@Override
	public int pedirGrua() {
		Random rnd = new Random();
		int id = rnd.nextInt(10000); // número entero aleatorio entre 0 y 9999

		return id;
	}

	@Override
	public double consultarEstadoGrua(int id) {
		double tiempoDemora = id * 2;

		return tiempoDemora;
	}

	@Override
	public void cancelarGrua(int id) {
		System.out.println("La grúa del proveedor ACA y con id: " + id + " fue cancelada");

	}

	@Override
	public String getNombreProveedor() {
		return "ACA";
	}

}
