import derivada.Caballo;
import derivada.Gato;
import derivada.Perro;

public class Principal {

	public static void main(String[] args) {

		Perro serrucho = new Perro();
		serrucho.mover();
		serrucho.dormir();

		Gato kiwi = new Gato();
		kiwi.dormir();
		kiwi.mover();

		Caballo caballoLoco = new Caballo();
		caballoLoco.mover();
		caballoLoco.dormir();

	}

}
