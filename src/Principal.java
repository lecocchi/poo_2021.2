
public class Principal {

	public static void main(String[] args) {
		Instrumento instrumento = new Instrumento();
		Violin paganni = new Violin();
		Guitarra gibson = new Guitarra();
		Piano piano = new Piano();
		
		instrumento.tocar(paganni);
		instrumento.tocar(gibson);
		instrumento.tocar(piano);

	}

}
