import java.util.Random;// Ultilizamos o randon para gerar numeros pseudoaleatorios

// Pagamamento por boleto implementando a estrategia de pagamento PaymentStrategy
public class BoletoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        int boletoCode = random.nextInt(1000000);
        System.out.println("Codigo de boleto: " + boletoCode + "Pagamento de R$" + amount + "Realizado com sucesso." );
    }
}
