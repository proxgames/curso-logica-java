package src.main.java.org.training;

import java.util.Scanner;

public class uri1005problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double pesoNota1 = 3.5;
        double pesoNota2 = 7.5;

        double notaFinal = (nota1 * pesoNota1 + nota2 *pesoNota2) / (pesoNota1 + pesoNota2);

        System.out.printf("MEDIA = %.5f%n", notaFinal);

        scanner.close();
    }
}
