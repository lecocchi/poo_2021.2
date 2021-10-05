package derivada;

import base.Animal;

public class Perro extends Animal {

	@Override
	public void mover() {
		System.out.println("El perro se esta moviendo .....");
	}

	@Override
	public void dormir() {
		System.out.println("El perro esta durmiendo .....");
	}

}
