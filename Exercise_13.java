import javax.swing.*;

public class Exercise_13 {
    public static void main(String[] args) {
        /*13) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas
        por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que
         es lo que se repite y lo que no.*/

        int cantidadVentas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de ventas del Día"));

        double[] ventas = new double[cantidadVentas];
        double total = 0;

        for(int i = 0; i < ventas.length; i++) {
            double precioVenta = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la venta: " + (i+1) + " -$: "));
            ventas[i] = precioVenta;
            total += ventas[i];
        }

        JOptionPane.showMessageDialog(null, "Es precio total de las ventas del día es: " + total);

    }
}
