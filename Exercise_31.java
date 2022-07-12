import javax.swing.*;

public class Exercise_31 {
    public static void main(String[] args) {
        /*31) Mostrar la longitud de una cadena.*/

        String cadena = JOptionPane.showInputDialog("Ingrese una Cadena de Texto: ");

        JOptionPane.showMessageDialog(null, "El Largo de la cadena ingresada es: " + cadena.length());
    }
}
