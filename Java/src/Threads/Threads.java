package Threads;

public class Threads {
    public static void main(String[] args) {
            new Thread(p1).start();
            new Thread(p2).start();
    }
    private static Runnable p1 = new Runnable() {
        @Override
        public void run() {
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 1 : " + i);
            }
        }
    };
    private static Runnable p2 = new Runnable() {
        @Override
        public void run() {
            for(int j = 0; j < 10; j++){
                System.out.println("Thread 2 : " + j);
            }
        }
    };
}