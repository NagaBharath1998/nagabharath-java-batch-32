package june14;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketBooking {
    private static final int TOTAL_TICKETS = 10;
    private static int availableTickets = TOTAL_TICKETS;
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {

        Thread[] threads = new Thread[5];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(new TicketBuyer(), "Buyer " + (i + 1));
            threads[i].start();
        }


        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    static class TicketBuyer implements Runnable {
        @Override
        public void run() {
            while (availableTickets > 0) {

                lock.lock();

                try {
                    if (availableTickets > 0) {

                        System.out.println(Thread.currentThread().getName() + " booked ticket " + availableTickets);
                        availableTickets--;
                    }
                } finally {

                    lock.unlock();
                }
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

