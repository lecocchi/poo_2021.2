import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import base.Animal;

public class Principal {

	public static void main(String[] args) {

		List<Animal> zoologico = new ArrayList<Animal>();

		zoologico.add(new Leon(21, 15.4));
		zoologico.add(new Pajaro(40.3, 5));
		zoologico.add(new Elefante(2, 20));
		zoologico.add(new Tigre("oscuro", 7));
		zoologico.add(new Leon(35, 250));

		for (Animal animal : zoologico) {
			System.out.println(animal.getEdad());
		}

		System.out.println("+++++++++++++++++++++++");

		zoologico.sort((a1, a2) -> a1.getEdad().compareTo(a2.getEdad()));

		for (Animal animal : zoologico) {
			System.out.println(animal.getEdad());
		}

		System.out.println("+++++++++++++++++++++++");

		zoologico.sort((a1, a2) -> a2.getEdad().compareTo(a1.getEdad()));

		for (Animal animal : zoologico) {
			System.out.println(animal.getEdad());
		}
		
		
		
		// Calculo para saber la cantidad de leones que pensan mas que 200 kilos;
		// Mostramos las dos soluciones posibles, con programacion funcional y de 
		// forma con el for.
		

		// 1- Con programacion funcional
		long cantidad = zoologico.stream().filter((a) -> a instanceof Leon && ((Leon) a).getPeso() > 200)
				.count();
		
		
		System.out.println("La cantidad de leones que pesan mas de 200 kilos son: " + cantidad);

		
		
		// 2- Con el for
		int cantidadLeones = 0;
		
		for (Animal animal : zoologico) {

			if (animal instanceof Leon && ((Leon) animal).getPeso() > 200) {
				cantidadLeones++;
			}
		}
		
		System.out.println("La cantidad de leones que pesan mas de 200 kilos son: " + cantidadLeones);

	}

}
