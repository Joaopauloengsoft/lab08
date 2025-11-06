package SisFuncionarios;

public class Desenvolvedor extends Funcionario {
    private double salarioBase;
    private String linguagemPreferida;
    private int anosExperiencia;

    public Desenvolvedor(String nome, String matricula, double salarioBase, String linguagemPreferida, int anosExperiencia) {
        super(nome, matricula);
        this.salarioBase = salarioBase;
        this.linguagemPreferida = linguagemPreferida;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public double calcularSalario() {
        return salarioBase + (salarioBase * 0.10 * anosExperiencia);
    }

    @Override
    public void realizarTarefa() {
        System.out.println("Desenvolvedor " + getNome() + " está codificando em " + linguagemPreferida + ".");
    }
}