/*
1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta.
 */
package exercise1;

public class Main {

    public static void main(String[] args) {

        //Declaracion del objeto perro
        Animal perro = new Perro("pepito", "cachorritos", 3, "Pitbull");
        perro.alimentarse();

        //Declaracion del objeto gato
        Animal gato = new Gato("Teddy", "galletas", 6, "Siames");
        gato.alimentarse();

        //Declaracion del objeto caballo
        Animal caballo = new Caballo("Spark", "pasto", 5, "Fino");
        caballo.alimentarse();

    }

}
