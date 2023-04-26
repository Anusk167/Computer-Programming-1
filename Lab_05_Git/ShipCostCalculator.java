public class ShipCostCalculator{
    public static void main(String[] args) {

        double item_price = 102;
        double shippingFee = item_price * 0.02;
        double total = shippingFee + item_price;
        if (item_price >= 100) {

            System.out.println("You qualify for free shipping! Your total is $" + item_price);
        } else {
            System.out.println("Shipping fee is $" + shippingFee);
            System.out.println("Your total is $" + total);
        }
    }
}