import javax.swing.*;

public class Exercise_33 {
    public static void main(String[] args) {
        /*33) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.*/

        String cadena = JOptionPane.showInputDialog("Ingrese una palabra o frase: ");
        String newCadena = cadena.substring(4,6);

        JOptionPane.showMessageDialog(null, "La cual y quinta letra de la frase es: "+ newCadena);
    }
}
