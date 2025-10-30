// import java.io.BufferedReader;
// import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your age: ");
        // InputStreamReader in  = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int age = Integer.parseInt(bf.readLine());
        // System.out.println("Your age is: " + age);

        // bf.close(); // Close buffered reader

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        sc.close();
    }
}
