public class MonthlyCCBalance {
    public static void main(String args[]) {
        double int_bal=5000;
        double rate=0.17;
        double new_bal= int_bal+(int_bal*rate);

        System.out.println("Initial balance= $" + int_bal);
        System.out.println("Balance after one month= $" + new_bal);
        System.out.println("Balance after two months= $" + (new_bal+(rate*new_bal)));
    }
}
