package practice_java.processAndThread;

public class Main {
    public static void main(String[] args) {
        Thread1 th1 = new Thread1();

        Runnable r = new Thread2();
        Thread th2 = new Thread(r);

        th1.start();
        th2.start();
    }
}
