import javax.swing.*;

public class Exercise_38 {

    public static void main(String[] args) {
        /*38) Pedir números al usuario y cuando el usuario meta un -1 se terminará el programa.
        Al terminar, mostrará lo siguiente:
        – mayor numero introducido
        – menor numero introducido
        – suma de todos los numeros
        – suma de los numeros positivos
        – suma de los numeros negativos
        – media de la suma (la primera que pido)

        El número -1 no contara como número.*/

        int num = 0;
        int maxNum = 0;
        int minNum = 10000;
        int sum = 0;
        int sumPos = 0;
        int sumNeg = 0;
        int media = 0;
        int cont = 0;

        while(num != -1) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un Número: "));
            if(num != -1) {
                cont++;
                sum += num;

                if(num > maxNum) {
                    maxNum = num;
                }
                if(num < minNum) {
                    minNum = num;
                }
                if(num > 0) {
                    sumPos += num;
                }

                if(num < 0) {
                    sumNeg += num;
                }
            }



        }

        media = sum / cont;

        System.out.println("mayor numero introducido: " + maxNum);
        System.out.println("menor numero introducido: " + minNum);
        System.out.println("suma de todos los numeros: " + sum);
        System.out.println("suma de los numeros positivos: " + sumPos);
        System.out.println("suma de los numeros negativos: " + sumNeg);
        System.out.println("media de la suma: " + media);

    }
}
