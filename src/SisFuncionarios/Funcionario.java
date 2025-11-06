package SisFuncionarios;

public abstract class Funcionario {
    private String nome;
    private String matricula;

    public Funcionario(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public abstract double calcularSalario();
    public abstract void realizarTarefa();
}
