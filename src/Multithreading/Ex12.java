package Multithreading;

public class Ex12 {
    static final Object lock = new Object();

    synchronized void mobileCall () {
        synchronized (lock) {
            System.out.println("Mobile Call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Mobile Call ends");
        }
    }
        synchronized void skypeCall () {
            synchronized (lock) {

                System.out.println("Skype Call starts");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Skype Call ends");
            }
        }
            synchronized void whatsappCall () {
        synchronized (lock) {
                System.out.println("Whatsapp Call starts");
                try {
                    Thread.sleep(7000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Whatsapp Call ends");
            }
        }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImpMobile());
        Thread thread2 = new Thread(new RunnableImpSkype());
        Thread thread3 = new Thread(new RunnableImpWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();

    }
}
class RunnableImpMobile implements Runnable {
    public void run () {
        new Ex12().mobileCall();
    }
}
class RunnableImpSkype implements Runnable {
    public void run () {
        new Ex12().skypeCall();
    }
}
class RunnableImpWhatsapp implements Runnable {
    public void run () {
        new Ex12().whatsappCall();
    }
}