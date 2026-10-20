import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";
        System.out.print("Enter the item price: ");
        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();


            if (itemPrice >= 100) {
                // shippingCost = 0
                shippingCost = 0;
            } else {
                // shippingCost = itemPrice * 0.02
                shippingCost = itemPrice * 0.02;
            } // endIf

            // totalPrice = itemPrice + shippingCost
            totalPrice = itemPrice + shippingCost;


            System.out.println("Shipping Cost: $" + shippingCost);
            System.out.println("Total Price: $" + totalPrice);

        } else {

            trash = in.nextLine();
            System.out.println("Invalid input: " + trash + ". Run the program again and enter a valid amount!");
        } // endIf
    }
}