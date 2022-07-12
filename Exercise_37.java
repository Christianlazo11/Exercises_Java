import javax.swing.*;

public class Exercise_37 {
    public static void main(String[] args) {
        /*37) Crea el enum Mes, que contenga como parametros el orden(1,2,3,etc) y el numero de dias (febrero tendra
        28 dias siempre).Estos datos pueden pedirse por separado, asi que tienes que hacer sus respectivos get.
        No son necesarios los setters.Create un arrays de Mes (mirate la funcion values), pide un numero por teclado e
        indica que meses tienen ese
        numero de dias (toda su informacion).Por ejemplo, si escribes un 28, este te devolvera la informacion de FEBRERO.*/

        DaysWeek02[] months = DaysWeek02.values();

        int days = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Número de días: "));

        for(int i = 0; i < months.length; i++) {
            if(months[i].getNumDays() == days) {
                System.out.println(months[i].toString());
            }
        }


    }
}
