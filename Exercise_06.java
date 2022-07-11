import javax.swing.JOptionPane;

public class Exercise_06 {

    public static void main(String[] args) {
    /*6) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.*/

        double dataNum = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número: "));
        if(dataNum % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El Número: " + dataNum + " Si es divisible entre dos");
        } else {
            JOptionPane.showMessageDialog(null, "El Número: " + dataNum + " No es divisible entre dos");
        }

    }
}
