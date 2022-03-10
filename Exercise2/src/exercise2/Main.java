/*
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios
para mostrar el precio final de los dos electrodomésticos.
 */
package exercise2;


public class Main {

    public static void main(String[] args) {
        
        Televisor televisor = new Televisor();          
        Lavadora lavadora = new Lavadora();
        
        System.out.println(" -Televisor- ");
        televisor.crearTelevisor();
        System.out.println(televisor);
        
        System.out.println(" -Lavadora- ");
        lavadora.crearLavadora();
        System.out.println(lavadora);
        
    }
    
}
