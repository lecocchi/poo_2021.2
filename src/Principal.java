import derivada.ProveedorAca;
import derivada.ProveedorSos;

public class Principal {

	public static void main(String[] args) {

		int id;
		double tiempoDemora;
		
		// Solicitar un grúa de ACA

		ProveedorAca aca = new ProveedorAca();

		id = aca.pedirGrua();
		System.out.println("Se solicitó un grúa a " + aca.getNombreProveedor() + " con id: " + id);
		
		tiempoDemora = aca.consultarEstadoGrua(id);
		System.out.println("La grúa del proveedor " + aca.getNombreProveedor() + " llega en " + tiempoDemora);
		
		aca.cancelarGrua(id);
		
		
		// Solicitar un grúa de SOS
		
		System.out.println("");
		System.out.println("***************************************");
		System.out.println("");

		ProveedorSos sos = new ProveedorSos();

		id = aca.pedirGrua();
		System.out.println("Se solicitó un grúa a " + sos.getNombreProveedor() + " con id: " + id);
		
		tiempoDemora = sos.consultarEstadoGrua(id);
		System.out.println("La grúa del proveedor " + sos.getNombreProveedor() + " llega en " + tiempoDemora);
		
		sos.cancelarGrua(id);

	}

}
