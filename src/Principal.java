import java.util.Optional;

public class Principal {
	public static void main(String[] args) {
		
		
		PersonaService personaService = new PersonaService();
		
		
		personaService.agregarPersona(new Persona("Leandro", "Cocchi", 41));
		
		
		
		Persona personaABuscar = personaService.buscarPersonaPorNombre("matias");
		
		
		Optional<Persona> personaOptional = Optional.ofNullable(personaABuscar);		

		
		if(personaOptional.isPresent()) {
			System.out.println(personaOptional.get().getNombre());
		}else {
			System.out.println("La persona con nombre: Matias no existe");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
