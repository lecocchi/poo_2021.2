import derivada.Paciente;

public class Principal {
	public static void main(String[] args) {
		
		Paciente paciente = new Paciente(123, 987, "Leandro", "Cocchi");
		
		System.out.println(paciente.getDni());
		System.out.println(paciente.getNumeroInternacion());
		System.out.println(paciente.getNombre());
		
	}
}