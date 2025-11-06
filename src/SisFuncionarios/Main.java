package SisFuncionarios;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> equipe = new ArrayList<>();

        equipe.add(new Gerente("Carlos Silva", "G001", 8000.00, 2500.00));
        equipe.add(new Desenvolvedor("Ana Souza", "D102", 5000.00, "Java", 3));
        equipe.add(new Estagiario("Pedro Santos", "E999", 1500.00));

        System.out.println("=== Folha de Pagamento e Atividades ===\n");
        for (Funcionario f : equipe) {
            System.out.println("Funcionário: " + f.getNome());
            f.realizarTarefa();
            System.out.printf("Salário a receber: R$ %.2f%n\n", f.calcularSalario());
        }
    }
}