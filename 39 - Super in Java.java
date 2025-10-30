/* 
    super keyword is used to call constructor of super class.
    By defualt, whenever a contructor is called(dafault one or parameterised one), it will call super class default constructor. 
    Now, we can explicitly tell it to call super class parameterised constructor by using super keyword.

    Every class in Java extends the Object class by default.
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
        // super(); 
        super(5); // Call parameterised constructor of super class
        System.out.println("in B");
    }

    public B(int n) {
        // super(); // Call default constructor of super class
        super(n);
        System.out.println("in B int");
    }
}

class Demo {
    public static void main(String[] args) 
	{
		
		B obj=new B();
        // B obj=new B(5);
        System.out.println(obj);
	}
}