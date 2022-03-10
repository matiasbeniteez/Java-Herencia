
package exercise3;

import java.util.Locale;
import java.util.Scanner;


public class Lavadora extends Electrodomestico{
    
    private Double carga;

    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public Lavadora(){
        
    }
    
    public Lavadora(Double carga, Double precio, String color, char consumoEnergetico, Double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Double getCarga() {
        return carga;
    }

    public void setCarga(Double carga) {
        this.carga = carga;
    }
    
    public void crearLavadora(){
        
        crearElectrodomestico();
        
        System.out.println("Ingrese carga de la lavadora en kg: ");
        carga = read.nextDouble();  
        
        precioFinal();
    }

    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(carga> 30){
            precio += 500;
        }
    }

    @Override
    public String toString() {
        return "Precio Lavadora: $ " + precio ; 
    }
    
    
}
