import javax.swing.*;
import java.util.Locale;

public class Exercise_35 {
    public static void main(String[] args) {
        /*35) Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).*/

        String dataDay = JOptionPane.showInputDialog("Ingrese un Día de la semana");

        DaysWeek data = DaysWeek.valueOf(dataDay.toUpperCase());
        switch (data) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El día " + data.name().toLowerCase() + " Si es Laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El Día " + data.name().toLowerCase() + " No es Laborable");
                break;
            default:
                System.out.println("El Día que ingreso no existe xD !!!");
        }
    }
}
