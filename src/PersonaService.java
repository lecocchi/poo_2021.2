import java.util.ArrayList;
import java.util.List;

public class PersonaService {
	
	private List<Persona> personas = new ArrayList<Persona>();
	
	
	public void agregarPersona(Persona persona) {
		personas.add(persona);
	}
	
	
	public void eliminarPersonaPorNombre(String nombre) {
		
		personas.removeIf((p) -> p.getNombre().equalsIgnoreCase(nombre));
		
		
//		for(Persona persona : personas) {
//			if(persona.getNombre().equalsIgnoreCase(nombre)) {
//				personas.remove(persona);
//			}
//		}
		
		
//		for(int i = 0 ; i < personas.size() ; i++) {
//			if(personas.get(i).getNombre().equalsIgnoreCase(nombre)) {
//				personas.remove(personas.get(i));
//			}
//		}
		
	}


	public Persona buscarPersonaPorNombre(String nombre) {
		
		for(Persona persona : personas) {
			if(persona.getNombre().equalsIgnoreCase(nombre)) {
				return persona;
			}
		}
		
		return null;
		
	}
	
	
	
	
	
	

}
