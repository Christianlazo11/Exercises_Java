import javax.swing.JOptionPane;

public class Exercise_08 {
    public static void main(String[] args) {
    /*8) Modifica el ejercicio anterior, para que en lugar de pedir un número, pida un carácter (char) y muestre su
    código en la tabla ASCII.*/

        char data = JOptionPane.showInputDialog("Ingrese una letra: ").charAt(0);

        JOptionPane.showMessageDialog(null, "El Número del la letra es : " + ((int)data));
    }
}
