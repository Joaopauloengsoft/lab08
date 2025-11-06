package FormasGeometricas;

public class Quadrado extends Forma {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    @Override
    public void desenhar() {
        System.out.println("Desenhando um Quadrado.");
    }
}