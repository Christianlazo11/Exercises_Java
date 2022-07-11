import javax.swing.JOptionPane;

public class Exercise_04 {

    public static void main(String[] args) {
    /*4) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).*/

        String name = JOptionPane.showInputDialog("Ingrese su nombre");

        JOptionPane.showMessageDialog(null, "Bienvenido " + name);
    }
}
