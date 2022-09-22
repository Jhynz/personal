import java.util.Scanner;

public class App {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        myOrder();
    }

    static void myOrder() {

        String pizza = "";
        double price = 0;
        String typeofcrust = "";
        String size = "";

        System.out.println("Welcome to Angels Pizza!");

        System.out.println("Please select from our menu:");
        System.out.println("Enter A if you want a Creamy Spinach Pizza that costs 400.00 pesos");
        System.out.println("Enter B if you want a Four Cheese Pizza that costs 300.00 pesos");

        System.out.print("Enter your choice here: ");
        char choice = scan.next().charAt(0);

        switch (choice) {
            case 'A':
                pizza = "Creamy Spinach Pizza";
                price = 400.00;
                break;
            case 'B':
                pizza = "Four Cheese Pizza";
                price = 300.00;
                break;
            default:
                System.out.println("Invalid Order");
                return;
        }

        System.out.println("Enter letter T if you want a Thick Crust!");
        System.out.println("Enter letter t if you want a Thin Crust!");

        System.out.print("Enter your choice: ");
        char Crust = scan.next().charAt(0);

        switch (Crust) {
            case 'T':
                typeofcrust = "Thick Crust";
                break;
            case 't':
                typeofcrust = "Thin Crust";
                break;
            default:
                System.out.println("Please enter T or t!");
                return;
        }

        System.out.println("Enter letter Medium if you want a 12 inch pizza!");
        System.out.println("Enter letter Family if you want a 18 inch pizaa!");
        System.out.println("Enter letter Big-Family if you want a 24 inch sized pizaa!");

        System.out.print("Enter your choice: ");
        String Size = scan.next();

        switch (Size) {
            case "Medium":
                size = "12 inch";
                break;
            case "Family":
                size = "18 inch";
                break;
            case "Big-Family":
                size = "24 inch";
                break;
            default:
                System.out.println("Please enter a valid size!");
                return;
        }

        System.out.println("Enter how many pizza that you want!");
        System.out.println("Enter quantity: ");
        int quantity = scan.nextInt();

        double totalPrice = price * quantity;

        System.out.println("Your order is: " + pizza);
        System.out.println("Your total amount is: " + price);
        System.out.println("Crust: " + typeofcrust);
        System.out.println("Size: " + size);
        System.out.println("Quantity: " + totalPrice);
        scan.close();
    }
}
