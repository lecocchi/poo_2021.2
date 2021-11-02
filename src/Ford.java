
public class Ford  implements Auto{
	
	private String patente;
	
	public Ford(String patente) {
		this.patente = patente;
	}

	@Override
	public void arrancar() {
		System.out.println("El ford esta arrancando");
		
	}

	@Override
	public void frenar() {
		System.out.println("El ford esta frenando");
		
	}

	@Override
	public String obtenerPatente() {
		return patente;
	}

}
