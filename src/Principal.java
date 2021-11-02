import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		// fiat, honda, ford
		
		List<Auto> autos = new ArrayList<Auto>();
			
		autos.add(new Fiat("AB123"));
		autos.add(new Honda("AB456"));
		autos.add(new Ford("AB789"));
		autos.add(new Honda("BC321"));
		
		
		
		for (Auto auto : autos) {
			if(auto.obtenerPatente().equalsIgnoreCase("AB456")) {
				
				System.out.println(auto.obtenerPatente());
				
			}
		}
		
		
		// funcion Lambda
		// Lambda function
		
//		()->{
//			
//		}
		
		
		 autos.stream()
			.filter((auto) -> auto.obtenerPatente().contains("AB"))
			.forEach((a) -> System.out.println(a.obtenerPatente()));;


	}

}
