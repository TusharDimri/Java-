class A extends Thread {
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Hello");
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

    
        // We can wither use constants like MAX_PRIORITY or we can choose between 1-10
        // to set priority
        obj1.setPriority(Thread.MAX_PRIORITY);
        // We are just suggesting our scheduler when we give priority to a thread and it
        // is not compulsory, final output decided by scheduler.

        obj1.start();
        obj2.start();
    }

}
