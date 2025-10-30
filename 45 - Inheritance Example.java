class Demo
{
    // For Inheritance, we just need the class file. Even without java file, we can do inheritance.

	public static void main(String a[]) 
	{
        // Calc obj=new Calc();
		AdvCalc obj=new AdvCalc(); // If we create object, the class file will be created on compilation
		int r1=obj.add(4, 5);
		int r2=obj.sub(7,3);
		int r3=obj.multi(5,3);
		int r4=obj.div(15,4);
		
		System.out.println(r1+" "+r2+" "+r3+" "+r4);
		
	}
}