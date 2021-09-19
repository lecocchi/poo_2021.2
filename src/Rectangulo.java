public class Rectangulo {

    private double lado1;
    private double lado2;

    public Rectangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public double getLado1() {
        return lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public double calcularPerimetro(){
        double perimetro = lado1 * 2 + lado2 * 2;
        return perimetro;
    }

    public double calcularSuperficie(){
        double superficie = lado1 * lado2;
        return superficie;
    }
}
