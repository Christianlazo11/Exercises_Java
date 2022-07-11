import javax.swing.JOptionPane;

public class Exercise_07 {
    public static void main(String[] args) {
        /*7) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
         Por ejemplo: si introduzco un 97, me muestre una a*/

        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));

        JOptionPane.showMessageDialog(null, "El Caracter del número es: " + ((char)num));
    }
}
