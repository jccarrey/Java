
package ejercicio.pkg4.joptionpane;

import javax.swing.JOptionPane;

public class Ejercicio4JOptionPane {

    public static void main(String[] args) {
        
        String cadena = JOptionPane.showInputDialog("Dime una cadena");
		JOptionPane.showMessageDialog(null, "La cadena es: " + cadena);
             
        char caracter = JOptionPane.showInputDialog("Introduzca un cadena").charAt(0);
            JOptionPane.showMessageDialog (null, "El primer caracter de la cadena es: " + caracter);
            
        int entero = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un entero"));
            JOptionPane.showMessageDialog (null, "Has introducido el entero: " + entero );
            
        float f1 = Float.parseFloat(JOptionPane.showInputDialog("Introduzca un flotante (CON PUNTO EH"));
            JOptionPane.showMessageDialog (null, "Has introducido el flotante: " + f1 );
            
        double f2 =  Double.parseDouble(JOptionPane.showInputDialog("Introduzca un decimal (TMB CON PUNTO EH"));
            JOptionPane.showMessageDialog (null, "Has introducido el decimal: " + f2 );
            
        
            
            
        
        
        
    }
    
}
