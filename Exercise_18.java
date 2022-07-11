import javax.swing.*;
public class Exercise_18 {
    public static void main(String[] args) {
    /*18) Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random
    para generar un número entero aleatorio (recuerda el casting de double a int).*/

     int num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer Número: "));
     int num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo Número: "));
     int[] numbers = new int[10];

     for(int i = 0; i < numbers.length; i++ ){
         numbers[i] = (int)(Math.random() * (num2 - num1) + (num1+1));
     }

     for(int i = 0; i < numbers.length; i++) {
         System.out.println(numbers[i] + "\n");
     }
    }
}
