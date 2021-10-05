package derivada;

import base.Animal;

public class Gato extends Animal {

	@Override
	public void dormir() {
		System.out.println("El gato esta durmiendo .....");
	}

	@Override
	public void mover() {
		System.out.println("El gato se esta moviendo .....");
	}

}
