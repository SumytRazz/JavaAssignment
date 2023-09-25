import java.util.Scanner;

public class Billing_System {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of the item:");
        int numItem = sc.nextInt();
        sc.nextLine();

        double totalPrice=0;

        for (int i = 1; i <= numItem; i++) {
            System.out.print("Enter item name " + i + ": ");
            String name = sc.nextLine();
            System.out.print("Enter quantity for " + name + ": ");
            int itemQuantity = sc.nextInt();
            System.out.print("Enter price per item for " + name + ": ");
            double itemPrice = sc.nextDouble();

            double Total = itemQuantity * itemPrice;
            totalPrice += Total;

            sc.nextLine();
        }

        double vat = totalPrice * 0.13;
        double discount = totalPrice * 0.10;
        double finalTotalCost = totalPrice + vat - discount;

        System.out.println("Bill");
        System.out.println("Total Cost: NRP" + totalPrice);
        System.out.println("VAT (10%): NRP" + vat);
        System.out.println("Discount (10%): NRP" + discount);
        System.out.println("Final Total Cost: NRP" + finalTotalCost);

        sc.close();


    }
}
