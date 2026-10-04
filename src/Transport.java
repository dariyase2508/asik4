public abstract class Transport{
    protected PaymentMethod paymentMethod;

    public Transport(PaymentMethod paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    public abstract void pay(double amount);
}
