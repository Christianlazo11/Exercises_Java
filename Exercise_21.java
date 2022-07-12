
public class Exercise_21 {

    public static void main(String[] args) {
        /*21) Muestra los números primos entre 1 y 100.*/

        for(int i = 2; i <= 100; i++) {
            int cont = 0;
            for(int j = 1; j <= i; j++) {
                if(i % j == 0) cont++;
            }

            if(cont == 2) {
                System.out.println(i + "\n");
            }
        }
    }
}
