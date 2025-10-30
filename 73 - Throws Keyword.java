class Demo {
    // Main method where program execution begins
    public static void main(String[] args) {
        // We will call a method that may throw an exception
        try {
            // Call the method that may throw an exception
            divideNumbers(10, 0);
        } catch (ArithmeticException e) {
            // Handle the exception if it occurs
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    // Method that may throw an ArithmeticException
    public static void divideNumbers(int num1, int num2) throws ArithmeticException {
        // Check if denominator is zero
        if (num2 == 0) {
            // Throw an ArithmeticException if denominator is zero
            throw new ArithmeticException("Cannot divide by zero!");
        }
        // Perform division if denominator is not zero
        int result = num1 / num2;
        System.out.println("Result: " + result);
    }
}