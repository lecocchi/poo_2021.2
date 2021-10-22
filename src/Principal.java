
public class Principal {

	public static void main(String[] args) {

		// Primera Parte
		System.out.println("++++++++++++++ Primera Parte ++++++++++++++++");

		Alumno andres = new Alumno("Andres", 12345678);
		Alumno agustin = new Alumno("Agustin", 87654321);

		System.out.println(andres.getNombre());
		System.out.println(agustin.getNombre());

		System.out.println("++++++++++++++++++++++++++++++");

		andres.setNombre("Melisa");
		agustin.setNombre("Luciana");

		System.out.println(andres.getNombre());
		System.out.println(agustin.getNombre());

		// Segunda parte
		System.out.println("++++++++++++++ Segunda Parte ++++++++++++++++");

		andres.apellido = "Fabiano";
		System.out.println(agustin.apellido);

		// Tercera parte
		System.out.println("++++++++++++++ Tercera Parte ++++++++++++++++");
		
		System.out.println(Matematica.sumar(10, 10));
		System.out.println(Matematica.sumar(15, 30));
		System.out.println(Matematica.sumar(2, 2));

	}

}
