import javax.swing.*;
public class Exercise_28 {
    public static void main(String[] args) {
        /*28) Eliminar los espacios de una frase pasada por consola por el usuario.*/

        String cadena = JOptionPane.showInputDialog("Ingrese una frase: ");
        String newCadena = "";

        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) != ' ') {
                newCadena += cadena.charAt(i);
            }
        }

        JOptionPane.showMessageDialog(null, "La Frase Resultante es: " + newCadena);
    }
}
