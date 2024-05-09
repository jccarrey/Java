package condicionales7;

import javax.swing.JOptionPane;

public class Condicionales7 {

    public static void main(String[] args) {
        //        Ejercicio 7: Pedir tres números y mostrarlos ordenados de mayor a menor

        int n1, n2, n3;

        n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer número entero: "));
        n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo numero entero: "));
        n3 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el tercer número entero: "));

        if ((n1 > n2) && (n2 > n3)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n1 + " - " + n2 + " - " + n3);
        } else if ((n1 > n3) && (n3 > n2)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n1 + " - " + n3 + " - " + n2);
        } else if ((n2 > n1) && (n1 > n3)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n2 + " - " + n1 + " - " + n3);
        } else if ((n2 > n3) && (n3 > n1)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n2 + " - " + n3 + " - " + n1);
        } else if ((n3 > n1) && (n1 > n2)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n3 + " - " + n1 + " - " + n2);
        } else if ((n3 > n2) && (n2 > n1)) {
            JOptionPane.showMessageDialog(null, "El orden es: " + n3 + " - " + n2 + " - " + n1);
        }
    }

}
