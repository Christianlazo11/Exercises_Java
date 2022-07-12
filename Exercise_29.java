import javax.swing.*;
public class Exercise_29 {
    public static void main(String[] args) {
    /*29) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar
    la cadena resultante*/

        String cadena = " ";
        String cadenaTotal = "";

        while(cadena != "") {
            cadena = JOptionPane.showInputDialog("Ingrese una frase: ").trim();
            cadenaTotal += cadena;
        }

        JOptionPane.showMessageDialog(null, "La cadena resultante es " + "\n" + cadenaTotal);


    }
}
