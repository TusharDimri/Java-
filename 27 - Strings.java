class Demo {
    public static void main(String[] args) {
        // String in Java is a class and not data type (S is capital in first letter).
        String name = new String("Tushar");
        // String name="Tushar";  // This is more common syntax.
        System.out.println(name);
        System.out.println(name.hashCode());
        System.out.println("Hey " + name);
        System.out.println(name.concat("Dimri"));

    }
}