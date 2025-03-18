// Classe que utiliza o Factory Method para criar instâncias das estratégias de pagamento
public class PaymentFactory {
    public static PaymentStrategy createPaymentStrategy(int choice) {
        switch (choice) {
            case 1:// Retorna a estratégia de pagamento via Pix
                return new PixPayment();
            case 2:// Retorna a estratégia de pagamento via Cartão de Crédito
                return new CartaoCreditoPayment();
            case 3:// Retorna a estratégia de pagamento via Boleto
                return new BoletoPayment();
            default: // Lança exceção para escolha inválida
                throw new IllegalArgumentException("Método de pagamento inválido.");
        }
    }
}