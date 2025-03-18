import java.util.Scanner; // Ultilizando o scanner para armazenar a entrada de dados do usuário
// Pagamamento por cartão de credito implementando a estrategia de pagamento PaymentStrateg
public class CartaoCreditoPayment implements PaymentStrategy {
    @Override
    public void processPayment(double amount) {
        System.out.println("Digite o numero do cartão de credito: ");
        Scanner scanner = new Scanner(System.in);
        String cartaoNumero = scanner.nextLine();
        System.out.println("Pagamento de R$ " + amount + "Realizado com sucesso usando o cartão de credito " + cartaoNumero + ".");
    }
}
