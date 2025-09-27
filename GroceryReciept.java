import java.util.Scanner;
/*
 * Task 3: GroceryReciept
 */

 public class GroceryReciept
 {
    public static void main(String[] args)
    {
        // VARIABLES and scanner input :(
        final double GST_RATE = 0.05 ;
        final double PST_RATE = 0.07;
        final double LOYALTY_DISCOUNT = 0.003;
        String loyalty;
        double item1;
        double item2;
        double item3;
        double subtotal;
        double gst;
        double pst;
        double total;
        double discount;
        double taxable_amount;
        Scanner input = new Scanner(System.in);

        // input stuff
        System.out.print("Item price 1: ");
        item1 = input.nextDouble();
        System.out.print("Item price 2: ");
        item2 = input.nextDouble();
        System.out.print("Item price 3: ");
        item3 = input.nextDouble();
        System.out.print("Loyalty member? (Y/N): ");
        loyalty = input.next();

        // computation
        subtotal = (item1 + item2 + item3);
        // IF STATEMENT FOR LOYALTY MEMBER THING
        if ("Y".equals(loyalty)){
            discount = (LOYALTY_DISCOUNT*subtotal);
        }
        else {
            discount = 0;
        }
        taxable_amount = (subtotal - discount);
        gst = (GST_RATE*taxable_amount);
        pst = (PST_RATE*taxable_amount);
        total = (taxable_amount + gst + pst);

        // OUTPUT

        System.out.print("\nSubtotal: " + subtotal + "CAD");
        System.out.print("\nLoyalty Discount: ~" + discount + "CAD" );
        System.out.print("\nGST (5%): " + gst + "CAD");
        System.out.print("\nPST(7%): " + pst + "CAD");
        System.out.print("\nTotal: " + total + "CAD");
    }
 }