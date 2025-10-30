/*
Super is used to call the constructor of super class. Similarly, this is used to call the constructor of current class. 
By default it calls the default constructor.
 */

class A {
    public A() {
        super();
        System.out.println("in A");
    }

    public A(int n) {
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        super();
        System.out.println("in B");
    }

    public B(int n) {
        this(); // Call constructor of same class
        System.out.println("in B int");
    }
}

class Demo {
    public static void main(String[] args) {

        // B obj=new B();
        B obj = new B(5);
        System.out.println(obj);
    }
}