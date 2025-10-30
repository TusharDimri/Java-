class Mobile {
    String brand;
    int price;
    String network;
    static String name;

    // Static block is being used to intialize static variable which we do'nt need to initailize for every object during its creation and that's why we're not using it in constructor. We can see how this is not called on every object initilization and is called only once.

    /* 
        Every time we create objects, there are two steps: Class loads and then objects are instantiated.
        Class loads only once and static block is executed only once. In JVM we have class loader.
        So, the static block is called before any other constructor.
    */
    public Mobile() {
        brand = "";
        price = 200;
        // name="Phone";
        System.out.println("in constructor");
    }

    static {
        name = "Phone";
        System.out.println("in static block");
    }


    public void show() {
        System.out.println(brand + " : " + price + " : " + name);
    }

}

class Demo {
    public static void main(String[] args) throws ClassNotFoundException{

        // Mobile obj1=new Mobile();
        // obj1.brand="Apple";
        // obj1.price=1500;
        
        // Mobile obj2=new Mobile();
        // obj2.brand="Samsung";
        // obj2.price=1700;

        
        // If we don't create a class object, then static block is not called. So, to call static block, we need do this:
        // Class.forName("Mobile");
        

    }
}