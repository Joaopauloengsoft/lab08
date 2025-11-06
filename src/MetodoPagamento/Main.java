package MetodoPagamento;

public class Main {
    public static void main(String[] args) {
        CartaoCredito cartao = new CartaoCredito("1234-5678-9012-3456", "João Botelho", "12/28");
        Boleto boleto = new Boleto("12345678901234567890", "10/11/2025");
        Pix pix = new Pix("joao@email.com");

        realizarPagamento(cartao, 150.00);
        realizarPagamento(boleto, 89.90);
        realizarPagamento(pix, 45.50);
    }

    public static void realizarPagamento(MetodoPagamento metodo, double valor) {
        System.out.println("--- Iniciando Pagamento ---");
        boolean sucesso = metodo.processarPagamento(valor);
        if (sucesso) {
            System.out.println("Status: Aprovado\n");
        } else {
            System.out.println("Status: Falhou\n");
        }
    }
}