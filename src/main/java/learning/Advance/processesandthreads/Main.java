package main.java.learning.Advance.processesandthreads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // System.out.println(Thread.activeCount());
        // Thread.currentThread().setName("prisca");
        // System.out.println(Thread.currentThread().getName());
        // Thread.currentThread().setPriority(10);
        // System.out.println(Thread.currentThread().getPriority());
        // System.out.println(Thread.currentThread().isAlive());

        // for (int i = 3; i > 0; i--) {
        // System.out.println(i);
        // Thread.sleep(2000);
        // }
        // System.out.println("You're done!");

        MyThread thread2 = new MyThread();

        thread2.setDaemon(true);
        System.out.println(thread2.isDaemon());

        thread2.start();

        // these 2 methods work the same way

        // thread2.sleep(1000);
        // thread2.join();

        // System.out.println(thread2.isAlive());
        // thread2.setName("2nd thread");
        // System.out.println(thread2.getName());

    }
}
