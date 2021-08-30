
public class Principal {

	public static void main(String[] args) {

		Persona leandro = new Persona();

		leandro.nombre = "Leandro";
		leandro.apellido = "Cocchi";
		leandro.edad = 41;

		leandro.caminar();
		leandro.saltar();
		leandro.hablar();

		Ascensor ascensor = new Ascensor();

		ascensor.marca = "Hp";
		ascensor.numeroSerie = 123456;

		ascensor.subir();
		ascensor.bajar();

		Avion boing = new Avion();

		boing.modelo = "Boing";
		boing.capacidadPersona = 200;
		boing.alturaMaxima = 10000;

		boing.volar();
		boing.aterrizar();

		Deportista messi = new Deportista();
		messi.nombre = "Leonel";
		messi.apellido = "Messi";
		messi.deportePractica = "Futbol";

		messi.correr();
		messi.descansar();
		messi.saltar();

		CajeroAutomatico banelco = new CajeroAutomatico();
		banelco.alto = 10;
		banelco.color = "Gris";
		banelco.marca = "Cualquiera";

		banelco.cambiarClave();
		banelco.depositarCheque();
		banelco.retirarDinero();

	}

}
