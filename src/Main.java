//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final double VAT = 0.15;

        String item1Name = "Bread";
        double item1Price = 18.99;
        int item1Qty = 2;

        String item2Name = "Milk";
        double item2Price = 22.50;
        int item2Qty = 3;

        String item3Name = "Eggs";
        double item3Price = 45.00;
        int item3Qty = 1;

        double item1SubTotal = item1Qty * item1Price;
        double item2SubTotal = item2Qty * item2Price;
        double item3SubTotal = item3Qty * item3Price;

        double subTotal = item1SubTotal + item2SubTotal + item3SubTotal;
        double vatTotal = subTotal * VAT;
        double total = subTotal + vatTotal;

        System.out.println("===========================");
        System.out.println("\t\tLEBO'S GOODS");
        System.out.println("===========================");
        System.out.println(item1Name + "\t\t\t" + "x" + item1Qty + "\tR" + String.format("%.2f", item1SubTotal));
        System.out.println(item2Name + "\t\t\t" + "x" + item2Qty + "\tR" + String.format("%.2f", item2SubTotal));
        System.out.println(item3Name + "\t\t\t" + "x" + item3Qty + "\tR" + String.format("%.2f", item3SubTotal));
        System.out.println("---------------------------");
        System.out.println("Subtotal:" + "\t\t\tR" + String.format("%.2f", subTotal));
        System.out.println("VAT (15%):" + "\t\t\tR" + String.format("%.2f", vatTotal));
        System.out.println("---------------------------");
        System.out.println("TOTAL:" + "\t\t\t\tR" + String.format("%.2f", total));
        System.out.println("===========================" );
    }
}