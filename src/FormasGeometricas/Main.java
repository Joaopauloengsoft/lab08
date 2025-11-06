package FormasGeometricas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Circulo(5.0));
        formas.add(new Quadrado(4.0));
        formas.add(new Triangulo(6.0, 3.0));

        for (Forma forma : formas) {
            forma.desenhar();
            System.out.printf("Área: %.2f%n\n", forma.calcularArea());
        }
    }
}