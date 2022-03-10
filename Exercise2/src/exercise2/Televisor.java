/*
Se debe crear también una subclase llamada Televisor con los siguientes
atributos: resolución (en pulgadas) y sintonizador TDT (booleano), además de los
atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de atributos
heredados. Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la
clase padre, lo utilizamos para llenar los atributos heredados del padre y
después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente
funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
incrementará el precio un 30% y si tiene un sintonizador TDT incorporado,
aumentará $500. Recuerda que las condiciones que hemos visto en la clase
Electrodomestico también deben afectar al precio.

 */
package exercise2;


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
