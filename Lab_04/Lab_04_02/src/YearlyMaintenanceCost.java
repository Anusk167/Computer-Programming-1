public class YearlyMaintenanceCost {
    public static void main(String args[]) {
        int Fall=150;
        int Winter=500;
        int Spring=150;
        int Summer=300;
        int Total = Fall+Winter+Spring+Summer;

        System.out.println("Maintenance cost for Fall= $" + Fall);
        System.out.println("Maintenance cost for Winter= $" + Winter);
        System.out.println("Maintenance cost for Spring= $" + Spring);
        System.out.println("Maintenance cost for Summer= $" + Summer);
        System.out.println("Annual Maintenance cost= $" + Total);
    }
}