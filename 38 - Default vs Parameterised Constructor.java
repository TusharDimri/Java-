class Human {
    private int age;
    private String name;

    public Human() // Default constructor
    {
        age = 12;
        name = "John";
    }

    public Human(int age, String name) {  // Parameterised constructor
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Human obj = new Human();
        Human obj1=new Human(18, "TD");
        System.out.println(obj.getName() + " : " + obj.getAge());
        System.out.println(obj1.getName()+" : "+obj1.getAge());
    }
}