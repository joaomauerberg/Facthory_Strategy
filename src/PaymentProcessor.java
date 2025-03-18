// Classe que processa o pagamento utilizando a estratégia definida
public class PaymentProcessor {
    private PaymentStrategy strategy;

    // Define a estratégia de pagamento
    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    // Processa o pagamento utilizando a estratégia definida
    public void processPayment(double amount) {
        strategy.processPayment(amount);
    }
}