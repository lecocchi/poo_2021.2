public class Cuadrado {
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado(){
        return lado;
    }

    public double calcularPerimetro(){
        double perimetro = lado * 4;
        return perimetro;
    }

    public double calcularSuperficie(){
        double superficie = lado * lado;
        return superficie;
    }
}
