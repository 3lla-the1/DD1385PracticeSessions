public class CashPayment implements PaymentStrategy {
    

    @Override
    public void pay(float amount) {
        System.out.println("Cash: " + amount);
    }
}
