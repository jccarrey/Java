
package operadores;

import java.util.concurrent.ThreadLocalRandom;

public class Operadores {

    public static void main(String[] args) {
        int numero = 10;
        int x,y;
        numero += 5;
        numero -= 5;
        numero *= 5;
        numero /= 5;
        numero &=5 ;
            System.out.println("El resultado de la combinación de operadores es: " + numero);
        
        ++numero;
            System.out.println("El resultado de numero++ es: " + numero);
        --numero;
            System.out.println("El resultado de numero-- es: " + numero);
        
        x = 5;
        y = x++;
            System.out.println("La x es " + x + " y la y es " + y);
        
        x = 5;
        y = ++x;
            System.out.println("La x es " + x + " y la y es " + y);
    
        // Raiz cuadrada
        double raiz = Math.sqrt(9);
        int raiz2 = (int) Math.sqrt(16);
            System.out.println("La raiz cuadrada de 9 es: " + raiz);
            System.out.println("La raiz cuadrada de 16 es: " + raiz2);
        
        //Potencia
        double base,exponente;
        base = 5;
        exponente = 3;
        double potencia = Math.pow(base, exponente);
            System.out.println("El resultado es: " + potencia);
    
        // Redondeo
        double n3 = 4.56;
        long redondeo =  Math.round(n3); // devuelve long
        System.out.println("El redondeo es: " + redondeo );
        int redondeo2 =  Math.round(5.67f); // devuelve int
        System.out.println("El redondeo flotante es: " + redondeo2);
    
        //Truncar
        System.out.println("Trunco: " + Math.floor(n3));
        System.out.println("Ceil: " + Math.ceil(n3));
    
        
    
        // Random
        double aleatorio = (Math.random()*50);
            System.out.println("El aleatorio es : " + aleatorio);
        
        // Generacion de un numero aleatrorio entre 0, 1, n y m
        int min = 10;
        int max = 20;
        int alea4 = ThreadLocalRandom.current().nextInt(min, max + 1);
        System.out.println("Thread: " + alea4);
    }
    
}
