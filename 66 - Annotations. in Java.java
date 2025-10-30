@Deprecated
class A{
    public void show(){
        System.out.println("Version 1");
    }
}

class B extends A{
    @Override
    public void show(){
        System.out.println("Version 2");
    }
}


// Annotations start making more sense as we work with frameworks and we will learn more of them in our Java journey.

class Demo {
    public static void main(String[] args) {
        
    }
}