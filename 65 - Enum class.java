enum Laptop {
    Macbook(2000), XPS(2200), Surface(), Thinkpad(1800);

    private int price;
    
    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    private Laptop() {
    }

    
}

class Demo{
    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " " + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " " + lap.getPrice());
        }
    }
}