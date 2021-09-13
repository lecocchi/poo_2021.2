
public class Principal {
	public static void main(String[] args) {

		Persona leandroObjeto = new Persona("Leandro", "Cocchi");
		System.out.println(leandroObjeto.getNombre());
		System.out.println(leandroObjeto.getApellido());
		System.out.println(leandroObjeto.obtenerNombreCompleto());

	}
}
