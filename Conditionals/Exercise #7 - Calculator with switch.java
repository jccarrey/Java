package condicionales8;

import javax.swing.JOptionPane;

public class Condicionales8 {

    public static void main(String[] args) {
        // Ejercicio 8: Construir un programa que simule el funcionamiento de una calculadora que puede realizar las cuatro opraciones aritméticas básicas (suma, resta, producto y división)
        // con valores numéricos enteros. El usuario debe especificar la operación con el primer carácter del primer parámetro de la línea de comandos: 
        //  S o s para la suma, R o r para la resta, P,p M o m para el producto y D o d para la división.
        
        int n1, n2, suma, resta, mult, div;
        char menu;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número entero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero entero: "));

        menu = JOptionPane.showInputDialog("Introduzca la operación que desee realizar: ").charAt(0);

        switch (menu) {
            case 'S':
            case 's':
                suma = n1 + n2;
                JOptionPane.showMessageDialog(null, " La suma es: " + suma);
                break;
            case 'R':
            case 'r':
                resta = n1 - n2;
                JOptionPane.showMessageDialog(null, "La resta es: " + resta);
                break;
            case 'p':
            case 'P':
            case 'm':
            case 'M':
                mult = n1 * n2;
                JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
            case 'd':
            case 'D':
                div = n1 / n2;
                JOptionPane.showMessageDialog(null, "La división es: " + div);
        }
    }
}

