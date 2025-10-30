class A implements Runnable {
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Hi");
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 1; i <= 100000; i++) {
            System.out.println("Hello");
        }
    }
}

class Demo {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        Runnable obj2 = new B();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MAX_PRIORITY);        

        t1.start();
        t2.start();
    }

}
