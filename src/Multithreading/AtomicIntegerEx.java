package Multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEx {
    //static int counter = 0;

    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
        //  counter++;
       // counter.incrementAndGet();
        counter.addAndGet(-5);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImp18());
        Thread thread2 = new Thread(new MyRunnableImp18());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(counter);

    }
}
class MyRunnableImp18 implements Runnable {
    @Override
    public void run () {
        for (int i = 0; i< 100;i++) {
            AtomicIntegerEx.increment();
        }
    }
}
