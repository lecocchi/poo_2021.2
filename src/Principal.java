import derivada.Mono;
import derivada.Perro;
import derivada.Pez;

public class Principal {

	public static void main(String[] args) {

		Mono mono = new Mono("Marron", "Banana", 2, 20);

		mono.trepar();
		System.out.println(mono.getColor());
		System.out.println(mono.getTipoAlimentacion());
		System.out.println(mono.getCantidadPatas());
		System.out.println(mono.getEdad());

		// ====================================================

		Perro perro = new Perro("Carne", 4, 15);

		perro.ladrar();
		System.out.println(perro.getTipoAlimentacion());
		System.out.println(perro.getCantidadPatas());
		System.out.println(perro.getEdad());

		// ====================================================

		Pez pez = new Pez("Gris", 24, 10);

		pez.nadar();
		System.out.println(pez.getColor());
		System.out.println(pez.getPeso());
		System.out.println(pez.getEdad());

	}

}
