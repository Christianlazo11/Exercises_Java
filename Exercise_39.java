public class Exercise_39 {
    public static void main(String[] args) throws InterruptedException {

        /*39) Realiza un reloj digital que muestre la hora sin parar.
        Debe esperar un segundo real para darle mas realismo.*/


        int hours = 0;
        int minutes = 0;
        int seg = 0;

        while(true) {

            if(hours < 10) {
                System.out.print("0");
            }
            System.out.print(hours + ":");

            if(minutes < 10) {
                System.out.print("0");
            }
            System.out.print(minutes + ":");
            if(seg < 10) {
                System.out.print("0");
            }
            System.out.println(seg);

            seg ++;

            if(seg == 60) {
                seg = 0;
                minutes ++;

                if(minutes == 60) {
                    minutes = 0;
                    hours++;

                    if(hours == 24) {
                        hours = 0;
                    }
                }
            }

            Thread.sleep(1000);
        }
    }
}
