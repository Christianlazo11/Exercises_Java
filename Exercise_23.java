import javax.swing.*;
public class Exercise_23 {
    public static void main(String[] args) {
        /*23) Reemplaza todas las a del String anterior por una e.*/

        String cadena = "La lluvia en Sevilla es una maravilla";
        String newCadena = "";

        for(int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == 'a') {
                newCadena += 'e';
            } else {
                newCadena += cadena.charAt(i);
            }
        }

        JOptionPane.showMessageDialog(null, "El nuevo texto es : "+ "\n" + newCadena);

    }
}
