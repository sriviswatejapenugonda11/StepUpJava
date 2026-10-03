import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter day: ");
        String day = sc.next();

        double price;
        if (age <= 12) {
            price = 100;
        } 
        else if (age >= 60) {
            price = 120;
        } 
        else {
            price = 200;
        }
        if (day.equalsIgnoreCase("Wednesday")) {
            price = price - (price * 0.20);
        }
        System.out.println("Final Price: " + price);
        sc.close();
    }
}