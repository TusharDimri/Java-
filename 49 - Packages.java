import tools.*;
// import java.util.ArrayList; // We have util folder inside java folder and inside util we have ArrayList class.

// Usually , packages have their names like : com.company.package. This is done to make package name unique.

class Demo{
	public static void main(String args[])
	{
		
		Calc obj=new Calc();
		AdvCalc obj1=new AdvCalc();
        // ArrayList al = new ArrayList<>();
		
        // java.lang is imported by default in every java file and System class is present in java.lang package.
        System.out.println(obj.add(3, 4));
        System.out.println(obj1.multi(3, 4));
	}
}