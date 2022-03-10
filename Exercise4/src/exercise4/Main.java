/*
4. Se plantea desarrollar un programa que nos permita calcular el área y el perímetro
de formas geométricas, en este caso un circulo y un rectángulo. Ya que este
calculo se va a repetir en las dos formas geométricas, vamos a crear una Interfaz,
llamada calculosFormas que tendrá, los dos métodos para calcular el área, el
perímetro y el valor de PI como constante.
Desarrollar el ejercicio para que las formas implementen los métodos de la
interfaz y se calcule el área y el perímetro de los dos. En el main se crearán las
formas y se mostrará el resultado final.
 */
package exercise4;

public class Main {

    public static void main(String[] args) {

        Circulo circulo = new Circulo(4.5d, 5d);

        circulo.calcularArea();
        circulo.calcularPerimetro();

        Rectangulo rectangulo = new Rectangulo(10d, 4.5d);

        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();
    }

}
