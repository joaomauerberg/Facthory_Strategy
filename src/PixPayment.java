import java.util.Random; // Ultilizamos o randon para gerar numeros pseudoaleatorios
// Pagamamento por pix implementando a estrategia de pagamento PaymentStrateg
public class PixPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        Random random = new Random();
        int pixCode = random.nextInt(1000000);
        System.out.println("Codigo Pix:" + pixCode + ". Pagamento de R$ " + amount + " realizado com sucesso. ");
    }
}
