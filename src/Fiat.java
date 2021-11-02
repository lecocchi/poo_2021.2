
public class Fiat implements Auto{
	
	private String patente;
	
	public Fiat(String patente) {
		this.patente = patente;
	}
	

	@Override
	public void arrancar() {
		System.out.println("El Fiat esta arrancando");
		
	}

	@Override
	public void frenar() {
		System.out.println("El Fiat esta frenando");
		
	}
	
	@Override
	public String obtenerPatente() {
		return patente;
	}

}
