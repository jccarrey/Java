package condicionales1;

import javax.swing.JOptionPane;

public class Condicionales1 {

    public static void main(String[] args) {
        
        // Ejercicio 1: Hacer un programa que lea un número entero y muestre si el número es múltiplo de 10
        
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un entero"));

        if (entero % 10 == 0) {
            JOptionPane.showMessageDialog(null, "El número " + entero + " es múltiplo de 10");
        } else {
            JOptionPane.showMessageDialog(null, "El número " + entero + " no es múltiplo de 10");
        }
    }

}
