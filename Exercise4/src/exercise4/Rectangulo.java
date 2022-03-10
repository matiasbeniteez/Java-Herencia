package exercise4;

public class Rectangulo implements CalculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {

    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Área rectángulo: base * altura / Perímetro rectángulo: (base + altura) * 2
    @Override
    public void calcularArea() {
        double area = base * altura;
        System.out.printf("Area del rectangulo: %.2f \n", area);
    }

    @Override
    public void calcularPerimetro() {
        double perimetro = (base + altura) * 2;
        System.out.printf("Perimetro del Rectangulo: %.2f \n", perimetro);
    }

}
