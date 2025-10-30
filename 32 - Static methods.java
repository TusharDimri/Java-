/* 
    The static keyword is used to construct methods that will exist regardless of whether or not any instances of the class are generated. Any method that uses the static keyword is referred to as a static method.

    Features of static method:
    --> A static method in Java is a method that is part of a class rather than an instance of that class.
    --> Every instance of a class has access to the method.
    --> Static methods have access to class variables (static variables) without using the class’s object (instance).
    --> Only static data may be accessed by a static method. It is unable to access data that is not static (instance variables).
    --> In both static and non-static methods, static methods can be accessed directly.

    In Java, the main method is declared as static because it needs to be accessible without creating an instance of the class.

    When you run a Java program, the Java Virtual Machine (JVM) needs a starting point to begin executing the code. This starting point is the main method.
    By declaring the main method as static, it means that you can call it directly without creating an instance of the class. This is important because the JVM needs to be able to find the main method without needing to create an object of the class.
    In other words, the static keyword allows the JVM to find and execute the main method without requiring an instance of the class. This is why the main method is always declared as static in Java programs.
 */

class Mobile {
    String brand;
    int price;
    String network;
    // String name;
    static String name;

    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(Mobile obj) {
        // We cannot use non static variables inside static method, so to use them here, we're passing an object duirng function call in parameter.
        System.out.println(obj.brand + " : " + obj.price + " : " + Mobile.name);
    }
}

class Demo {
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 1500;
        // obj1.name="SmartPhone";
        Mobile.name = "SmartPhone";

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 1700;
        // obj2.name="SmartPhone";
        Mobile.name = "SmartPhone";

        // obj1.name="Phone";
        Mobile.name = "SmartPhone";

        obj1.show();
        obj2.show();

        Mobile.show1(obj1);

    }
}