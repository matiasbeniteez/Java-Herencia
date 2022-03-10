package exercise4;

public class Circulo implements CalculosFormas {

    private double radio;
    private double diametro;

    public Circulo() {

    }

    public Circulo(double radio, double diametro) {
        this.radio = radio;
        this.diametro = diametro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    // Área circulo: PI * radio ^ 2 / Perímetro circulo: PI * diámetro.
    @Override
    public void calcularArea() {
        double area = 2 * PI * radio;
        System.out.printf("Area del circulo: %.2f \n", area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = PI * diametro;
        System.out.printf("Perimetro del circulo: %.2f \n", perimetro);
    }

}
