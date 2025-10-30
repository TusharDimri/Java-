
class Demo {
    public static void main(String[] args) {
        // Runnable obj1 = new Runnable() {
        //     public void run() {
        //         for (int i = 1; i <= 100000; i++) {
        //             System.out.println("Hi");
        //         }
        //     }
        // };
        // Runnable obj2 = new Runnable() {
        //     public void run() {
        //         for (int i = 1; i <= 100000; i++) {
        //             System.out.println("Hi");
        //         }
        //     }
        // };

        Runnable obj1 = ()  -> {
                for (int i = 1; i <= 100000; i++) {
                    System.out.println("Hi");
                }    
        };
        Runnable obj2 = ()  -> {
                for (int i = 1; i <= 100000; i++) {
                    System.out.println("Hi");
                }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
    }

}
