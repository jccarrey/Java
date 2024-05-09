package condicionales3;

import javax.swing.JOptionPane;

public class Condicionales3 {

    public static void main(String[] args) {

        // Ejercicio 3: Haz un programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
        
        char letra = JOptionPane.showInputDialog("Introduzca una letra: ").charAt(0);

        if (Character.isUpperCase(letra)) {
            JOptionPane.showMessageDialog(null, "Es una letra mayúscula");
        } else {
            JOptionPane.showMessageDialog(null, "No es una letra mayúscula");
        }
    }
}
