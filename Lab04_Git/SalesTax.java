public class SalesTax {
    public static void main(String args[]) {
        double price=100;
        double tax_rate=0.05;
        double sales_tax=price * tax_rate;

        System.out.println("Price of item =" + price);
        System.out.println("Sales tax on the item =" + sales_tax);
        System.out.println("Final price of item =" + (price+sales_tax));
    }
}
