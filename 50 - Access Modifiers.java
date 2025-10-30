import other.*;

class C extends A
{
	public void abc()
	{
		System.out.println(name); // Protected variable gets passed down to the child class.
		// Protected variables can be accessed inside the package and in sub classes.
	}
}

class Demo{
	public static void main(String[] args) {
   
	A obj=new A();
	System.out.println(obj.marks);  
	// Defualt varibales of a class , we can't use outside package.
	obj.show();
	
	B obj1=new B();
	System.out.println(obj1.marks); // We can access the default variables of the class as the class is in the same package.

	C obj2 = new C();
	obj2.abc();
	
	}
}