// States: NEW, RUNNABLE, RUNNING, WAITING, TERMINATED (BLOCKED is discussed in comments).

class MyThread extends Thread {
    public void run() {
        // RUNNING state: This code runs after start() is called and CPU gives time to
        // this thread.
        System.out.println("Thread is running: RUNNING state");
        try {
            // Simulate some task for 1 second so RUNNING state is visible
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Thread was interrupted!");
        }
        System.out.println("Thread work finished, will enter TERMINATED state after run() exits.");
    }
}

class Demo {
    public static void main(String[] args) throws InterruptedException {
        // NEW: Thread is created but not started yet
        MyThread t = new MyThread();
        System.out.println("State after creating thread (NEW): " + t.getState());

        // RUNNABLE: After start() is called, thread is ready to run (might not be
        // running immediately)
        t.start();
        System.out.println("State just after calling start() (RUNNABLE): " + t.getState());

        // Pause main a bit to allow t to start running or sleeping
        Thread.sleep(100); // t will be RUNNING or TIMED_WAITING (if inside sleep)

        // RUNNING and TIMED_WAITING:
        // - If 't' is executing run(), it's RUNNING
        // - If 't' is inside Thread.sleep, it's in TIMED_WAITING
        System.out.println("State after sleep (RUNNING/TIMED_WAITING): " + t.getState());

        // WAITING: This main thread now waits for 't' to finish using join()
        t.join(); // Main thread is now WAITING until 't' finishes its work

        // TERMINATED: After run() finishes, state is TERMINATED
        System.out.println("State after thread finishes (TERMINATED): " + t.getState());

        /*
         * BLOCKED (not shown with code here):
         * - A thread gets BLOCKED if it wants to enter a synchronized method or block,
         * but another thread is already inside.
         * - Example: If two threads try to access a synchronized method at the same
         * time,
         * one thread runs it, the other becomes BLOCKED (waiting for the lock).
         */

        /*
         * Thread States and Transitions:
         * 
         * New:
         * The thread is created but not started yet (e.g., Thread t = new Thread();).
         * It is waiting for the start() command.
         * 
         * Runnable:
         * After calling start(), the thread moves to the Runnable state.
         * The thread is ready to run and is waiting for the CPU to assign time for
         * execution.
         * (Note: The JVM chooses when the thread actually starts running.)
         * 
         * Running:
         * When the thread scheduler picks this thread to run, it enters the Running
         * state.
         * Code inside the run() method is being executed.
         * 
         * Waiting:
         * If the thread calls sleep() or wait(), it moves into the Waiting state.
         * The thread now pauses and will only continue when certain conditions are met:
         * 
         * notify() or notifyAll() wakes up a waiting thread.
         * 
         * If sleeping, it will automatically go back after the time ends.
         * 
         * Dead:
         * The thread moves to Dead (also called Terminated) state once the run() method
         * finishes
         * or if the stop() method is called.
         * The thread can’t be started again after this.
         */

        /*
         * How Threads Change States:
            * 
            * start(): New → Runnable
            * 
            * run(): Runnable → Running (done by JVM)
            * 
            * sleep(), wait() in Running: Running → Waiting
            * 
            * notify(), or sleep/wait ends: Waiting → Runnable
            * 
            * stop() or after run() ends: Running → Dead
         */
    }
}
