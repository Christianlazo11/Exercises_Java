import javax.swing.JOptionPane;

public class Exercise_09 {

    public static void main(String[] args) {
        /*9) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio
        final con IVA. El IVA sera una constante que sera del 21%.*/
        final double iva = 21;
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Precio del producto: $"));

        double descuento = precio - (precio * (iva / 100));

        JOptionPane.showMessageDialog(null, "Es precio final del producto es: " + descuento);
    }
}
