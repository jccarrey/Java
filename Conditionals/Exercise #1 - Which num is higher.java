package condicionales2;

import javax.swing.JOptionPane;

public class Condicionales2 {

    public static void main(String[] args) {

        // Ejercicio 2: Pedir dos números y decir cual es el mayor o si son iguales.
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número entero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero entero: "));
        if (n1 > n2) {
            JOptionPane.showMessageDialog(null, " El primer número, " + (n1) + " , es el mayor de los dos ");
        } else if (n1 < n2) {
            JOptionPane.showMessageDialog(null, " El segundo número, " + (n2) + " , es el mayor de los dos");
        } else {
            JOptionPane.showMessageDialog(null, " Ambos números son iguales ");
        }
    }

}
