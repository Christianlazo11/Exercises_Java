import javax.swing.*;
import java.util.Locale;

public class Exercise_17 {
    public static void main(String[] args) {
    /*17) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.
    Usa un switch para ello.*/

        String day = JOptionPane.showInputDialog("Ingrese un Día de la semana: ");
        String message = "";

        switch (day.toLowerCase()) {
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                message = "El Día " + day + " Si es un día laboral!";
                break;
            case "sabado":
            case "domingo":
                message = "El Día " + day + " No es un día laboral!";
                break;
            default: message = "El Día " + day + " No existe!";

        }

        JOptionPane.showMessageDialog(null, message);
    }
}
