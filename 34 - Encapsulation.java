/*
    Encapsulation is a fundamental concept in object-oriented programming (OOP) that binds together the data and the methods that manipulate that data, and keeps both safe from outside interference and misuse.

    In Java, encapsulation is achieved by creating a class that wraps around the data (attributes or fields) and the methods that operate on that data. The data is hidden from the outside world, and only the methods within the class can access and modify it.
*/

class Human {
    // int age;
    // private int age=11;
    private int age;
    // String name;
    // private String name="Navin";
    private String name;

    public int getAge() {
        return age;
    }

    public void SetAge(int a) {
        age = a;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

class Demo {
    public static void main(String[] args) {
        Human obj = new Human();
        obj.SetAge(30);
        obj.setName("Reddy");
        // obj.age=11;
        // obj.name="Navin";

        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}