import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
       String nm;

        // Normally, we do this:     
        //    Scanner sc = null;
        //     try {
        //         System.out.println("Enter your name: ");
        //         sc = new Scanner(System.in);
        //         nm = sc.nextLine();
        //         System.err.println(nm);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
        //     finally{
        //         sc.close();
        //     }

        // Try with resources:
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your name: ");
            nm = sc.nextLine();
            System.err.println(nm);
        }
    }
    
}
