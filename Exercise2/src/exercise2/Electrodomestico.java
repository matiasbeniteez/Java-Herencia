/*
2. Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.
Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra
es correcta, sino es correcta usara la letra F por defecto. Este método se debe
invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y
si no lo es, usa el color blanco por defecto. Los colores disponibles para los
electrodomésticos son blanco, negro, rojo, azul y gris. No importa si el nombre
está en mayúsculas o en minúsculas. Este método se invocará al crear el
objeto y no será visible.
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el
consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará
el valor del precio. Esta es la lista de precios:

LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
 */
package exercise2;

import java.util.Locale;
import java.util.Scanner;

public class Electrodomestico {
    
    protected Double precio;
    protected String color;
    protected char consumoEnergetico;
    protected Double peso;
    
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public Electrodomestico(){
        
    }

    public Electrodomestico(Double precio, String color, char consumoEnergetico, Double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public void comprobarConsumoEnergetico(char letra){
        letra = Character.toUpperCase(letra);
        
        if(letra<65 || letra>70){
            consumoEnergetico = 'F';           
        } else{
            consumoEnergetico = Character.toUpperCase(letra);
        }
    }
    
    public void comprobarColor(String color){
        // blanco, negro, rojo, azul y gris.
        if(!color.equalsIgnoreCase("blanco") || !color.equalsIgnoreCase("negro") || !color.equalsIgnoreCase("rojo") || !color.equalsIgnoreCase("azul") || !color.equalsIgnoreCase("gris")){
          this.color = "blanco";  
        }
    }
    
    public void crearElectrodomestico(){
        
        this.precio = 1.000;       
        System.out.println("Ingrese color del equipo: ");
        color = read.next();
        comprobarColor(color);
        System.out.println("Ingrese consumo energetico (A-F): ");
        consumoEnergetico = read.next().charAt(consumoEnergetico);
        comprobarConsumoEnergetico(consumoEnergetico);
        System.out.println("Ingrese peso en KG: ");
        peso = read.nextDouble();
    }
    
    /*
    LETRA PRECIO
A $1000
B $800
C $600
D $500
E $300
F $100

PESO PRECIO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500
Entre 50 y 79 kg $800
Mayor que 80 kg $1000
    */
   
    public void precioFinal(){
        switch(consumoEnergetico){
            case 'A':
                precio += 1000;
                break;
            case 'B':
                precio += 800;
                break;
            case 'C':
                precio += 600;
                break;
            case 'D':
                precio += 500;
                break;
            case 'E':
                precio += 300;
                break;
            case 'f':
                precio += 100;
                break;
        }
        if (peso>= 1 && peso<=19){
            precio += 100;
        } else if(peso>= 20 && peso<=49){
            precio += 500;
        } else if(peso>= 50 && peso<=79){
            precio += 800;
        } else if(peso>= 80){
            precio+= 1000;
        }
    }
    
    
}
