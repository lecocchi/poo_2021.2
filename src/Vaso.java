public class Vaso {
    private double alto;
    private double diametro;

    public Vaso(double alto, double diametro) {
        this.alto = alto;
        this.diametro = diametro;
    }

    public double getAlto() {
        return alto;
    }

    public double getDiametro() {
        return diametro;
    }

    public double calcularVolumen(){
        double superficie = 3.14 * diametro;
        double volumen = superficie * alto;
        return volumen;
    }
}
