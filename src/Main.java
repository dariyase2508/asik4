public class Main{
    public static void main(String[] args){

        Transport bus = new Bus(new CardPayment());
        bus.pay(110);

        System.out.println();

        Transport lrt = new LRT(new MobilePayment());
        bus.pay(200);

        System.out.println();

        bus = new Bus(new MobilePayment());
        bus.pay(150);
    }
}