public class CreditCardPayment implements PaymentStrategy {
    

    @Override
    public void pay(float amount) {
        System.out.println("Credit Card: " + amount);
    }
}
