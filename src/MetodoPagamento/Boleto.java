package MetodoPagamento;

public class Boleto implements MetodoPagamento {
    private String codigoBarra;
    private String dataVencimento;

    public Boleto(String codigoBarra, String dataVencimento) {
        this.codigoBarra = codigoBarra;
        this.dataVencimento = dataVencimento;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento de R$ " + valor + " com boleto gerado. Pague até " + dataVencimento + ".");
            return true;
        }
        return false;
    }
}
