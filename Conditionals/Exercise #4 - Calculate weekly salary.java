package condicionales5;

import javax.swing.JOptionPane;

public class Condicionales5 {

    public static void main(String[] args) {

        // Ejercicio 5: Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
        // - Si trabaja 40 horas o menos se le paga 16€ por hora.
        // - Si trabaja mas de 40 horas se le paga 16€ por cada una de las primeras 40 horas y 20€ por cada hora extra
        
        float horasTrabajadas, horasExtra, pagaBase, pagaExtra, salarioSemanal;

        horasTrabajadas = Float.parseFloat(JOptionPane.showInputDialog("Introduzca las horas trabajadas: "));

        if (horasTrabajadas <= 40) {
            pagaBase = 16f;
            salarioSemanal = horasTrabajadas * 16;
            JOptionPane.showMessageDialog(null, "Su salario semanal es de: " + salarioSemanal + "€ ");
        } else {
            horasExtra = Float.parseFloat(JOptionPane.showInputDialog("Introduzca las horas extra: "));
            pagaExtra = 20f;
            salarioSemanal = (horasTrabajadas * 16) + (horasExtra * 20);
            JOptionPane.showMessageDialog(null, "Su salario semanal es de: " + salarioSemanal + "€ ");
        }
    }

}
