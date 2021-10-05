package derivada;

import java.util.Random;

import base.ProveedorGrua;

public class ProveedorSos extends ProveedorGrua {

	@Override
	public int pedirGrua() {
		Random rnd = new Random();
		int id = rnd.nextInt(150); // número entero aleatorio entre 0 y 149

		return id;
	}

	@Override
	public double consultarEstadoGrua(int id) {
		double tiempoDemora = id / 2;

		return tiempoDemora;

	}

	@Override
	public void cancelarGrua(int id) {
		System.out.println("Se ha cancelado la grúa del proveedor SOS con id: " + id);
	}

	@Override
	public String getNombreProveedor() {
		return "SOS";
	}

}
