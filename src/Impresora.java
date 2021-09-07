
public class Impresora {
	String marca;

	public void imprimir(DocumentoPdf pdf) {
		System.out.println("Cantidad de hojas: " + pdf.cantidadHojas);
		System.out.println("El contenido es: " + pdf.contenido);
	}
	
	public void imprimir(DocumentoExcel excel) {
		System.out.println("Cantidad de hojas: " + excel.cantidadHojas);
		System.out.println("Cantidad de celdas: " + excel.cantidadCeldas);
	}
	

}
