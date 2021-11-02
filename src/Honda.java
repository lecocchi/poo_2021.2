
public class Honda implements Auto{
	
	
	private String patente;
	
	public Honda(String patente) {
		this.patente = patente;
	}

	@Override
	public void arrancar() {
		System.out.println("El honda esta arrancando");
		
	}

	@Override
	public void frenar() {
		System.out.println("El honda esta frenando");
		
	}

	@Override
	public String obtenerPatente() {
		return patente;
	}
	
}
