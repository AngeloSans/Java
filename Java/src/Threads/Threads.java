package Threads;

public class Threads {
    private static final Object lock = new Object();

    public static void main(String[] args) {
        new Thread(p1).start();
        new Thread(p2).start();
    }

    private static Runnable p1 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1 : " + i);
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }
    };
    private static Runnable p2 = new Runnable() {
        @Override
        public void run() {
            synchronized (lock) {
                for (int j = 0; j < 10; j++) {
                    System.out.println("Thread 2 : " + j);
                    try {
                        Thread.sleep(50000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        }


    };
}