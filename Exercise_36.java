import javax.swing.*;
public class Exercise_36 {
    public static void main(String[] args) {
     /*36) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).*/

        String day = JOptionPane.showInputDialog("Ingrese un día: ");

        DaysWeek data = DaysWeek.valueOf(day.toUpperCase());

        System.out.println(data.toString());
    }
}
