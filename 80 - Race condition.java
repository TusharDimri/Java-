class Counter {
    int count;  // Shared variable that both threads will try to update

    // synchronized → allows only one thread to run this method at a time
    // Without 'synchronized', both threads might change 'count' at the same time,
    // causing data corruption or wrong results.
    public synchronized void increment() {
        count++;  
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {

        Counter c = new Counter();

        // Each thread will run this code (increment count 10,000 times)
        Runnable task = () -> {
            for (int i = 1; i <= 10000; i++) {
                c.increment();
            }
        };

        // t1 and t2 are two independent threads
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        // Start both threads together; they run in parallel
        t1.start();
        t2.start();

        // Wait for both threads to finish before printing the result
        t1.join();
        t2.join();

        // When both threads finish, print the final shared value
        System.out.println(c.count);  // Expected output: 20000
    }
}