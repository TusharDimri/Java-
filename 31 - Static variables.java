/* 
    When a variable is declared as static, then a single copy of the variable is created and shared among all objects at the class level. Static variables are, essentiallyglobal variables. All instances of the class share the same static variable.

    Important points for static variables:

    --> We can create static variables at class-level only. 
    --> static block and static variables are executed in order they are present in a program.
    --> Static variable can call by directly with the help of class only, we do not need to create object for the class in this. 
 
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
        Mobile.name = "Phone"; // We dont need object to call static variables and we can use class name.

        obj1.show();
        obj2.show();

        // System.out.println(obj1.brand);

    }
}