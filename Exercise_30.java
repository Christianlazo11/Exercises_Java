import javax.swing.*;
import java.util.Locale;

public class Exercise_30 {
    public static void main(String[] args) {
        /*30) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y
        mostraremos el resultado por pantalla.*/

        String[] options = {"Mayuscula", "Minusculas"};

        String cadena = JOptionPane.showInputDialog("Ingrese una Frase: ");
        String newCadena = "";

        int option = JOptionPane.showOptionDialog(null, "Escoja La Opción que requiera:" , "Opciones",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        if(option == 0) {
            newCadena = cadena.toUpperCase(Locale.ROOT);
        } else{
            newCadena = cadena.toLowerCase(Locale.ROOT);
        }

        JOptionPane.showMessageDialog(null, "Frase Convertida: " + "\n" + newCadena);
    }
}
