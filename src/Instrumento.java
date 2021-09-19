
public class Instrumento {

	String tipo;

	public void tocar(Violin violin) {
		System.out.println("Está tocando un violín y tiene cuerdas");
	}

	public void tocar(Guitarra guitarra) {
		System.out.println("Está tocando una guitarra y tiene cuerdas");
	}

	public void tocar(Piano piano) {
		System.out.println("Está tocando un piano y no tiene cuerdas");
	}

}
