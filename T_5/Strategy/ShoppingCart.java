public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy = strategy;
    }

    void checkout(float amount) {
        this.paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(100);


        cart.setPaymentStrategy(new CashPayment());
        cart.checkout(50);



    }


}
