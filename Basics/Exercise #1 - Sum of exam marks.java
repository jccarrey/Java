
package operadores2;

import java.util.Scanner;

public class Operadores2 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int nota1, nota2, nota3, suma;
        System.out.print("Dime tu nota de lengua: ");
        nota1 = entrada.nextInt();
        System.out.print("Dime tu nota de mates: ");
        nota2 = entrada.nextInt();
        System.out.print("Dime tu nota de mates: ");
        nota3 = entrada.nextInt();
        
        suma = nota1 + nota2 + nota3;
        
        System.out.println("\nLa suma de las 3 notas es " + suma );
    }
    
}
