package exercise1;

public class Caballo extends Animal {

    public Caballo() {

    }

    public Caballo(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println(nombre + " se alimenta de: " + alimento);
    }

}
