
package condicionales4;

import javax.swing.JOptionPane;

public class Condicionales4 {

    public static void main(String[] args) {
        // Ejercicio 4: En el corte inglés se hace un 20% de descuento a los clientes cuya compra supere los 300€.
        // ¿Cuál será la cantidad que pagará una persona por su compra?
        
        float precioCompra, descuento, precioFinal;

        precioCompra = Float.parseFloat(JOptionPane.showInputDialog("Introduzca el precio de la compra: "));

        if (precioCompra > 300) {
            descuento = precioCompra * 0.20f;
            precioFinal = precioCompra - descuento;
            JOptionPane.showMessageDialog(null, "Tendrás que pagar: " + precioFinal);
        } else {
            JOptionPane.showMessageDialog(null, "Tendrás que pagar: " + precioCompra);
        }
    }
    
}
