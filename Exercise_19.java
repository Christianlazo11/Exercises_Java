import javax.swing.*;
public class Exercise_19 {
    public static void main(String[] args) {
        /*19) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
         Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas
         cifras, al mostrar el mensaje.*/

        int lengthNum = 0;
        while(lengthNum <= 0) {
            String number = JOptionPane.showInputDialog("Ingrese Un número: ");
            lengthNum = number.length();
        }


        JOptionPane.showMessageDialog(null, "El Número que ingreso tiene " + lengthNum + " Cifras");



    }
}
