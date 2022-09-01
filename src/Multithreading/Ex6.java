package Multithreading;

public class Ex6 implements Runnable {
    public void run () {
        System.out.println("Eto method Run. Thread name = " + Thread.currentThread().getName());

    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Ex6());
        System.out.println("Eto method Run. Thread name = "
                + Thread.currentThread().getName());
    }

}
