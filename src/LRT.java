public class LRT extends Transport {
    public LRT(PaymentMethod paymentMethod){
        super(paymentMethod);
    }

    @Override
    public void pay(double amount){
        System.out.println("LRT payment: ");
        paymentMethod.pay(amount);
    }
}
