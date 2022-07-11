import javax.swing.*;
public class Exercise_16 {
    public static void main(String[] args) {
        /*16) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que
         introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
         mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque
         le queden intentos).*/

        final String password = "holamundo";
        int cont = 0;
        boolean isCorrect = false;

        while(cont < 3) {

            String pass = JOptionPane.showInputDialog(null, "Ingrese la Contraseña: ");
            if(pass.equals(password)) {
                isCorrect = true;
            }

            cont++;
        }

        if(cont == 3 && !isCorrect) {
            JOptionPane.showMessageDialog(null, "La Contraseña Ingresada no es Correcta!");
        } else {
            JOptionPane.showMessageDialog(null, "La Contraseña ingresada es Correcta!");
        }

    }
}
