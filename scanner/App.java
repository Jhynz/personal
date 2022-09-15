import java.util.Scanner;

public class App { 
   
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
    
        // int product = multiplication();
        // System.out.println("The product is:" + product);

        // int quotient = division();
        // System.out.println("The quotient is:" + quotient);

        String crushName = revealMyCrush();
        System.out.println(crushName);
                                                                   
        scan.close();

    }

    static int multiplication() {
        System.out.println("Please enter two numbers to multiply");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x * y;


    }

    static int division() {
        System.out.println("Please enter two numbers to division");
        System.out.print("Enter first number: ");
        int x = scan.nextInt();

        System.out.print("Enter second number: ");
        int y = scan.nextInt();
        return x / y;

    }    

    static String revealMyCrush(){
        System.out.println("This will reveal the name of your crush");
       
        System.out.print("Enter the your name: ");
        
        String myName = scan.nextLine();
        
        System.out.print("Enter the name of your crush: ");
        
        String nameOfMyCrush = scan.nextLine();

        System.out.print("Enter the name of your 2nd crush: ");
        
        String nameOfMy2ndCrush = scan.nextLine();
       
        return myName + " loves " + nameOfMyCrush + " and " + nameOfMy2ndCrush;
    }
}
