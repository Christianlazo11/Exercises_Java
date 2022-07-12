import javax.swing.*;
public class Exercise_27 {
    public static void main(String[] args) {
        /*27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de
        números introducidos.*/

        int cont = 0;
        int num = 0;
        while(num != -1) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un Número: "));
            cont++;
        }

        JOptionPane.showMessageDialog(null, "La cantidad de numeros ingresados es: " + cont);
    }
}
