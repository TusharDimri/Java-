class A
{
	public void show()
	{
		System.out.println("in A show");
	}
}

class B extends A
{
	public void show()
	{
		System.out.println("in B show");
	}
}

class C extends A
{
	public void show()
	{
		System.out.println("in C show");
	}
}

class D
{
	
}

// class Computer
// {
//	
// }
// class Laptop extends Computer
// {
//	
// }

/*
    In Java, when a subclass overrides a method of its superclass, the correct method to be called is determined at runtime, not at compile time. This is known as Dynamic Method Dispatch.
    A is the superclass
    B and C are subclasses of A
    D is a separate class that does not extend A

    We create an object obj of type A and assign it to different subclasses (B and C) using polymorphism.

    Key points to note:
    The show() method is overridden in both B and C classes.
    The obj variable is declared as type A, but it can hold references to objects of type B and C due to polymorphism.

    When the JVM encounters the obj.show() statement, it doesn't know which show() method to call at compile time. Instead, it uses the following steps to determine the correct method at runtime:
    Late Binding: The JVM checks the type of the object being referred to by the obj variable at runtime.
    Method Lookup: The JVM searches for a method with the same name and signature (show()) in the class hierarchy of the object being referred to.
    Method Invocation: The JVM calls the method that is found in the previous step.
    In this case, the obj variable is assigned to objects of type B and C, which override the show() method. Therefore, the JVM calls the overridden method in each case.
 */

class Demo{
	public static void main(String[] args) {
        // A obj=new B(); // This works
        // obj.show();
		
		A obj=new A();
		obj.show();
		
		obj=new B();
		obj.show();
		
		obj=new C();
		obj.show();
		
        // obj=new D(); // This doesn't work as obj is of type A and D is not extending A

        // Laptop obj1=new Laptop();
        // Computer obj1=new Laptop();
        
	}
}