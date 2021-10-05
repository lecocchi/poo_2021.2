package derivada;

import base.Animal;

public class Caballo extends Animal {

	@Override
	public void mover() {
		System.out.println("El caballo esta moviendose .....");
	}

	@Override
	public void dormir() {
		System.out.println("El caballo esta durmiendo ......");
	}

}
