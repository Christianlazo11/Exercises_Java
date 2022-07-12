import javax.swing.*;
public class Exercise_34 {
    public static void main(String[] args) {
        /*34) Dada una frase, separarlo en palabras.*/

        String cadena = JOptionPane.showInputDialog("Ingrese una frase");
        String[] newCadena = cadena.split(" ");

        for(int i = 0; i < newCadena.length; i++) {
            System.out.println(newCadena[i]);
        }


    }
}
