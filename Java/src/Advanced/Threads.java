package Advanced;

public class Threads {
    public static void main(String[] args) {
        new Thread(t1).start();
        new Thread(t2).start();
    }
    public static Runnable t1 = new Runnable() {
        @Override
        public void run() {
            for(int i = 0; i < 10; i++){
                System.out.println("Thread 1: " + i);
            }
        }
    };
    public static Runnable t2 = new Runnable() {
        @Override
        public void run() {
            for(int j = 0; j < 10; j++){
                System.out.println("Thread 2: " + j);
            }
        }
    };


}
