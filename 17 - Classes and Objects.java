class Calculator {
    public int add(int n1, int n2) {
        // int a;
        // System.out.println("in add");
        // return 0;

        // int r=num1+num2;
        // return r;

        int r = n1 + n2;
        return r;
    }
}

// Objects have state(property) and behaviour
// We need a class to create an object. 
// An object is an instance of a class.
// JV, creates objects from class code.

class hello {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;
        Calculator calc = new Calculator();
        int result = calc.add(num1, num2);
        // calc.add();
        // int result=calc.add();
        // int result=num1+num2;
        System.out.println(result);

    }
}