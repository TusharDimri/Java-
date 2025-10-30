abstract class Car {
    // It is not compulsory for abstract class to have abstract methods. It can have just abstact methods, just concrete methods, or have both abstract and concrete methods.

    // public void drive()
    // {
    //
    // }

    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
        System.out.println("play music");
    }
}

abstract class WagnoR extends Car {
    // public void fly()
    // {
    // System.out.println("Flying...");
    // }
    public void drive() {
        System.out.println("Driving...");
    }
}

class UpdateWagnoR extends WagnoR // Concrete class. We can create object of this class as it's concrete.
{
    public void fly() {
        System.out.println("flying...");
    }
}

class Demo {
    // abstract methods should be overridden compulsarily.
    // We cant create object of abstract class, so we need to make a child class of that class.
    public static void main(String[] args) {

        // Car obj=new Car();
        // Car obj=new WagnoR();
        Car obj = new UpdateWagnoR();
        obj.drive();
        obj.playMusic();
    }
}