package june13;

class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Question1 extends Thread {
    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
    }
}

