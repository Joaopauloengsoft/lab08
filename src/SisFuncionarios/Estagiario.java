package SisFuncionarios;

public class Estagiario extends Funcionario {
    private double bolsaAuxilio;

    public Estagiario(String nome, String matricula, double bolsaAuxilio) {
        super(nome, matricula);
        this.bolsaAuxilio = bolsaAuxilio;
    }

    @Override
    public double calcularSalario() {
        return bolsaAuxilio;
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Estagiário " + getNome() + " está aprendendo e auxiliando.");
    }
}