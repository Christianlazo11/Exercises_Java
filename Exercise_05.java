import javax.swing.JOptionPane;
public class Exercise_05 {
    public static void main(String[] args) {
        /*5) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar
         de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.*/

        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del circulo: "));

        double total = Math.PI *  Math.pow(radio, 2);

        JOptionPane.showMessageDialog(null, "El área de circulo es :" + total);
    }
}
