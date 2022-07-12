import javax.swing.*;
public class Exercise_22 {
    public static void main(String[] args) {
        /*22) Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total
         (recorre el String con charAt).*/

        String[] vocales = {"a", "e", "i", "o", "u"};
        String cadena = "La lluvia en Sevilla es una maravilla";
        int cont = 0;

        for(int i = 0; i < cadena.length(); i++) {

            for(int j = 0; j < vocales.length; j++ ){
                if(cadena.charAt(i) == vocales[j].charAt(0)){
                    cont++;
                    break;
                }
            }
        }

        JOptionPane.showMessageDialog(null, "La frase contiene " + cont + " Vocales!");
    }
}
