package src.main.java.org.training;

import java.util.Locale;
import java.util.Scanner;

public class uri1012problema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double A, B, C;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();
        double pi = 3.14159;

        double areaTrianguloRetangulo = A * C / 2.0;

        double areaCirculo = pi * Math.pow(C, 2);

        double areaTrapezio = (A + B) * C / 2.0;

        double areaQuadrado = Math.pow(B,2);

        double areaDoRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f%n", areaTrianguloRetangulo);
        System.out.printf("CIRCULO: %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);

        scanner.close();
    }
}
