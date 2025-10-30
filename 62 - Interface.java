// abstract class Computer{
//     public abstract void code();
// }

interface Computer{
    public void code();
}

interface GPU{
    public void boost();
}


// Points to note:
// If we use abstract class for this then we extend that and if we use interface then we implement it.
// Both help us with decoupling the code.
// Interface is not a class and by default, all the methods in an interface are public and abstract.
// We can't create object of interface or of an abstract class.
// It is our job to implement the methods in an interface.
// In the class that implements the interface, we need to define all the methods in the interface , otherwise the class that implements it becomes  an abstract class.
// The variables in an Interface are final and they are static, so they need to be defined in Interface itslef and their values can;t be changed. Also these variables can't be used classes that implement the interface.
// The variables in interface are final becuase they are part of interface which does not have its own memory , then they are supposed to be final.
// A class can implement one or more interfaces, given that all methods in the interface are implemented.
//  We can inherit one interface from another and this means all mentods will be inherited so they need to be defined in the class that implements the inherited interface.

// Class to class - extends
// Interface to interface - extends
// interface to class - implements

class Laptop implements Computer{
    public void code() {
        System.out.println("Code, Compile, Run....");
    }
}

class Desktop implements Computer, GPU{

    public void boost() {
        System.out.println("Boosting ...");
    }
    public void code() {
        boost();
        System.out.println("Code, Compile, Run Faster....");
    }
}

class Developer {
    public void devApp(Computer comp) {
        comp.code();
    }
}

class Demo {
    public static void main(String[] args) {
        Developer dev1 = new Developer();
        Developer dev2 = new Developer();
        // dev.devApp();
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();
        dev1.devApp(laptop);
        dev2.devApp(desktop);
    }
}