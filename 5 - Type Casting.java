class hello {
    public static void main(String[] args) {
        // Implicit casting means no user intervention and explicit mean suser has to specify explicitly.

        byte b = 127;
        int a = b; // Implicit casting
        System.out.println(b);
        System.out.println(a);

        byte b1 = 125;
        int a0 = b1; // Implicit casting
        System.out.println(b1);
        System.out.println(a0);

        int aa = 257;
        byte k = (byte) aa;  // Explicit casting
        System.out.println(k);

        float f = 5.6f;
        int t1 = (int) f;
        System.out.println(t1);

        int a2 = 2567;
        byte b2 = (byte) a2; // Explicit casting
        System.out.println(b2);

        byte a3 = 10;
        byte b4 = 20;
        int t2 = a3 * b4; // Type Promotion
        System.out.println(t2);

    }
}