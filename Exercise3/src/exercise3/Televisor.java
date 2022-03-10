
package exercise3;

public class Televisor extends Electrodomestico{
    
    private Double pulgadas;
    private Boolean sintonizador;
    
    public Televisor(){
        
    }
    
    public Televisor(Double pulgadas, Boolean sintonizador, Double precio, String color, char consumoEnergetico, Double peso){
        super(precio, color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }

    public Double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(Double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public Boolean getSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(Boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor(){
        
        crearElectrodomestico();
        
        System.out.println("Ingrese resolucion en pulgadas de la tv: ");
        pulgadas = read.nextDouble();
        System.out.println("Ingrese si la TV posee sintonizador tdt (true/false)");
        sintonizador = read.nextBoolean();
        
        precioFinal();
    }
    
    @Override
    public void precioFinal(){
        
        super.precioFinal();
        
        if(pulgadas> 40){
            precio += precio * 0.3;
        }
        if( sintonizador=true){
            precio+=500;
        }
    }

    @Override
    public String toString() {
        return "Precio Televisor: " + precio;
    }
    
    
    
}

