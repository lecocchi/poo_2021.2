public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double calcularPerimetro(){
        double perimetro = 3.14 * radio * 2;
        return perimetro;
    }

    public double calcularSuperficie(){
        double superficie = 3.14 * radio * radio;
        return superficie;
    }
}
