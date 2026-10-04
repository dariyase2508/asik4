public class MobilePayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "kzt by mobile payment");
    }
}
