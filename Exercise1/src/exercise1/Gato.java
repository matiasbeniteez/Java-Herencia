package exercise1;

public class Gato extends Animal {

    public Gato() {

    }

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de: " + alimento);
    }

}
