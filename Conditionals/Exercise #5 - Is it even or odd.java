package condicionales6;

import javax.swing.JOptionPane;

public class Condicionales6 {

    public static void main(String[] args) {
        
        // Ejercicio 6: Hacer un programa que tome dos números y diga si ambos son pares o impares.
        
        int n1, n2;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número entero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero entero: "));

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son pares");
        } else if (n1 % 2 != 0 && n2 % 2 != 0) {
            JOptionPane.showMessageDialog(null, "Ambos números son impares");
        } else {
            JOptionPane.showMessageDialog(null, "Un número es par y otro es impar ");
        }
    }
}
