public class Bus extends Transport {
    public Bus(PaymentMethod paymentMethod){
        super(paymentMethod);
    }

    @Override
    public void pay(double amount){
        System.out.println("Bus payment: ");
        paymentMethod.pay(amount);
    }
}
