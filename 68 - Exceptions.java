class Demo {

    /*
     * Types of Errors:
     * 1. Compile Time Error
     * 2. Runtime Error
     * 3. Logical Error
     * 
     * Exception Hnadling is used to handle the runtime errors. This way, even if
     * there are exceptions, we can handle them so that our program does not break.
     */

    public static void main(String[] args) {
        /*
         * Statements are of 2 types:
         * 1. Normal Statement
         * 2. Critical Statement
         * 
         * int i = 0; // Normal Statement
         * int j = 8/i; // Critical Statement
         * 
         * as i is 0 we get divide by zero exception and this breaks our program.
         * 
         * We do exception handling for Critical Statements
         */

        int i = 2;
        // int i = 2;
        int j = 5;
        int nums[] = { 1, 2, 3, 4, 5 };
        // String str = null;

        try {
            j = 8 / i;
            System.out.println(nums[2]);
            // System.out.println(str.length());
        }

        catch (ArithmeticException e) {
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        // Exception is the parent class so that's why it is in the bottom.
        catch (Exception e) {
        System.out.println(e);
        }

        System.out.println(j);
        System.out.println("Done");

    }
}
