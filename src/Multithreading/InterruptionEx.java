package Multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main starts");

        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("main ends");


    }
}
class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run () {
        for (int i = 1; i<=1000000; i++) {
            if (isInterrupted()) {
                System.out.println("Potok hotyat prervat");
                System.out.println("Mi ubedilis, chto sostoyanie " +
                        "vsex obyektov normalnoe i reshili zaverhit rabotu potoka");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Potok xotyat prervat vo vremya sna. Davaite zaverhim ego rabotu");
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}
