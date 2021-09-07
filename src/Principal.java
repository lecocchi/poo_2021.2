
public class Principal {

	public static void main(String[] args) {
		
		Impresora hp = new Impresora();
		
		DocumentoPdf pdf = new DocumentoPdf();
		DocumentoExcel excel = new DocumentoExcel();
		
		hp.marca = "hp";
		
		pdf.cantidadHojas = 80;
		pdf.contenido = "Hola Mundo desde el contenido del pdf";
		
		excel.cantidadCeldas = 3;
		excel.cantidadHojas = 20;
		
		hp.imprimir(pdf);
		hp.imprimir(excel);

	}

}
