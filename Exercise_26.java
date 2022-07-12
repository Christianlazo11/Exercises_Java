import javax.swing.*;
public class Exercise_26 {
    public static void main(String[] args) {
        /*26) Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.*/
        int num = 0;
        int sum = 0;
        while(num <= 0) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número: "));
        }

        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        JOptionPane.showMessageDialog(null, "La suma de los Números es: " + sum);

    }
}
