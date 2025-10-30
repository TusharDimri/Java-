class A {
    public A() {
        System.out.println("object created");
    }

    public void show() {
        System.out.println("in A show");
    }
}

class Demo {
    public static void main(String a[]) {
        new A(); // This is an anonymous object. But, we are not assing it to any reference, so we can't reuse it.
        new A().show();

        A obj; 
        obj = new A();  // This is the same as doing A obj=new A();
        obj.show();
    }
}