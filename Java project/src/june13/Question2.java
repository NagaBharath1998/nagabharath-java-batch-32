package june13;
class NumberRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

public class Question2 {
    public static void main(String[] args) {
        NumberRunnable numberRunnable = new NumberRunnable();
        Thread thread = new Thread(numberRunnable);
        thread.start();
    }
}


