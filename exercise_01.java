public class exercise_01 {
    public static void main (String args[]) {
        /*1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación,
        división y módulo (resto de la división)*/
        int num1 = 26;
        int num2 = 2;

        System.out.println("Suma: " + (num1 + num2));
        System.out.println("Resta: " + (num1 - num2));
        System.out.println("Multiplicación: " + (num1 * num2));
        System.out.println("División: " + Double.valueOf(num1 / num2));
        System.out.println("Modulo: " + (num1 % num2));
    }
}
