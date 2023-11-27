package src.main.java.org.training;

import java.util.Scanner;

public class uri1006problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        int peso1 = 2;
        int peso2 = 3;
        int peso3 = 5;
        int pesoTotal = peso1 + peso2 + peso3;

        double media = (nota1 * peso1 + nota2 * peso2 + nota3 * peso3) / pesoTotal;

        System.out.printf("MEDIA = %.1f%n", media);

        scanner.close();
    }
}
