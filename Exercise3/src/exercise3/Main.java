/*
3. Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de
Electrodomésticos para guardar 4 electrodomésticos, ya sean lavadoras o
televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada
electrodoméstico. Se deberá también mostrar el precio de cada tipo de objeto,
es decir, el precio de todos los televisores y el de las lavadoras. Una vez hecho
eso, también deberemos mostrar, la suma del precio de todos los
Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de 2000
y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
 */
package exercise3;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Electrodomestico> electrodomesticos = new ArrayList();

        int contTv = 0;
        int contLav = 0;
        int contTotal = 0;

        Televisor televisor = new Televisor(31d, false, 1000d, "rojo", 'A', 15d);
        Televisor televisor2 = new Televisor(55d, true, 1000d, "negro", 'A', 20d);
        electrodomesticos.add(televisor);
        electrodomesticos.add(televisor2);

        Lavadora lavadora = new Lavadora(30d, 1000d, "blanco", 'A', 50d);
        Lavadora lavadora2 = new Lavadora(25d, 1000d, "blanco", 'B', 40d);
        electrodomesticos.add(lavadora);
        electrodomesticos.add(lavadora2);

        for (Electrodomestico element : electrodomesticos) {
            if (element instanceof Televisor) {
                element.precioFinal();
                contTv += element.precio;
            } else {
                element.precioFinal();
                contLav += element.precio;
            }
        }
        System.out.println("Precio Total de Televisores: " + contTv);
        System.out.println("Precio Total de Lavadoras: " + contLav);
        
        for(Electrodomestico element : electrodomesticos){
            contTotal += element.precio;
        }
        System.out.println("El precio Total de los electrodomestico es: $ "+contTotal);
    }

}
