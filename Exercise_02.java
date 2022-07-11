import javax.swing.JOptionPane;

public class Exercise_02 {

    public static void main (String args[]) {
        /*2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales
        indicarlo también. Ves cambiando los valores para comprobar que funciona.*/

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número: "));
        String message = "";
        if(num1 > num2) {
            message = num1 + " es mayor que "+ num2;
        } else if (num1 < num2) {
            message = num2 + " es mayor que " + num1;
        } else {
            message = num1 + " Es igual a " + num2;
        }

        JOptionPane.showMessageDialog(null, message);
    }
}
