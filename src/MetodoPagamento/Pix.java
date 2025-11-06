package MetodoPagamento;

public class Pix implements MetodoPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public boolean processarPagamento(double valor) {
        if (valor > 0) {
            System.out.println("Pagamento de R$ " + valor + " com Pix realizado para a chave " + chavePix + ".");
            return true;
        }
        return false;
    }
}