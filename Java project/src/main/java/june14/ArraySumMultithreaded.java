package june14;

public class ArraySumMultithreaded {
    private static final int ARRAY_SIZE = 100;
    private static final int NUM_THREADS = 5;
    private static final int PARTIAL_SIZE = ARRAY_SIZE / NUM_THREADS;

    private static int[] array = new int[ARRAY_SIZE];
    private static int[] partialSums = new int[NUM_THREADS];
    private static int finalSum = 0;
    public static void main(String[] args) throws InterruptedException {

        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = i + 1;
        }


        SumThread[] threads = new SumThread[NUM_THREADS];


        for (int i = 0; i < NUM_THREADS; i++) {
            int start = i * PARTIAL_SIZE;
            int end = start + PARTIAL_SIZE;

            if (i == NUM_THREADS - 1) {
                end = ARRAY_SIZE;
            }

            threads[i] = new SumThread(start, end);
            threads[i].start();
        }


        for (SumThread thread : threads) {
            thread.join();
        }

        for (int partialSum : partialSums) {
            finalSum += partialSum;
        }

        System.out.println("Final sum: " + finalSum);
    }

    static class SumThread extends Thread {
        private int start;
        private int end;

        public SumThread(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            int partialSum = 0;
            for (int i = start; i < end; i++) {
                partialSum += array[i];
            }
            partialSums[start / PARTIAL_SIZE] = partialSum;
        }
    }
}
