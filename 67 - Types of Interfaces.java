// Types of intrfaces in java:
// 1. Normal Interface - 2 methods or more in the interface.
// 2. Marker Interface - Mo method in the interface.
// 3. Functional Interface / Single Abstrace Method - Only one method in the interface.

// One method only so this is a functional interface
@FunctionalInterface
interface A {
    void show(String s);
}

@FunctionalInterface
interface Calculator {
    int add(int n1, int n2);
}   

class Demo {
    public static void main(String[] args) {    
        A obj = new A () {
            public void show(String s) {
                System.out.println("in new show" + s);
            }
        };
        obj.show("Hello");

        // Same thing as above but with Lambda Expressions:
        A obj1 = (String s) -> 
        {
            System.out.println("in new show" + s);
        };
        obj1.show("Hello");
        
        // we can retirn values without using return keyword:
        Calculator calc = (int n1, int n2) -> n1 + n2;
        calc.add(2, 3);
    }
}
