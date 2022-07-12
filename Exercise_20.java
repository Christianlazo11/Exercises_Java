import javax.swing.*;
public class Exercise_20 {
    public static void main(String[] args) {
    /*20) Pide un número por teclado e indica si es un número primo o no. Un número primo es aquel solo puede dividirse
    entre 1 y si mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
    Un buen truco para calcular la raíz cuadrada del numero e ir comprobando que si es divisible desde ese numero hasta 1.
    NOTA: Si se introduce un numero menor o igual que 1, directamente es no primo.*/


        int number = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número: "));
        String message = "";
        if(number == 0 || number == 1) {
            message = "Es número ingresado No es primo";
        } else {
            for(int i = 2; i < number; i++) {
                if(number % i == 0){
                    message = "El Número ingresado No es Primo!";
                    break;
                }
            }
        }

        if(message == "") {
            message = "El número ingresado Si es Primo";
        }
        JOptionPane.showMessageDialog(null, message);
    }
}
