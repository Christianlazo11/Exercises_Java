import javax.swing.*;

public class Exercise_32 {
    public static void main(String[] args) {
        /*32) Pedir dos palabras por teclado, indicar si son iguales.*/

        String pal01 = JOptionPane.showInputDialog("Ingrese la primera palabra: ");
        String pal02 = JOptionPane.showInputDialog("Ingrese la segunda palabra: ");
        String message = "";
        if(pal01.equals(pal02)){
            message = "Las palabras son iguales!";
        } else {
            message = "Las palabras No son iguales";
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
