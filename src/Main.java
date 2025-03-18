import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();
        Scanner scanner = new Scanner(System.in);

        // Exibe as opções de pagamento
        System.out.println("Escolha o metodo de pagamento:");
        System.out.println("1: Pix");
        System.out.println("2: Cartão de Crédito");
        System.out.println("3: Boleto");
        int choice = scanner.nextInt();

        try {
            // Cria a estratégia de pagamento com base na entrada de dados do usuário
            PaymentStrategy strategy = PaymentFactory.createPaymentStrategy(choice);
            processor.setPaymentStrategy(strategy); // Define a estratégia no processador de pagamentos
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage()); // Exibe mensagem de erro para escolha inválida
            return;
        }

        // Solicita o valor da transação
        System.out.println("Digite o valor da transação:");
        double amount = scanner.nextDouble();

        // Processa o pagamento
        processor.processPayment(amount);
    }
}