import javax.swing.*;
public class Exercise_15 {
    public static void main(String[] args) {
       /*15) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a
       pedir (do while), después muestra ese número por consola.*/
        int cont = 0;
        do{
            cont = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un número: "));
        } while( cont >= 0);

        JOptionPane.showMessageDialog(null, "El número ingresado fue: " + cont);
    }
}
