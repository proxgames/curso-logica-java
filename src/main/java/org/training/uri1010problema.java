package src.main.java.org.training;

import java.util.Scanner;

public class uri1010problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1 = scanner.nextInt();
        int numeroPecas1 = scanner.nextInt();
        double precoUnit1 = scanner.nextDouble();

        int codigoPeca2 = scanner.nextInt();
        int numeroPecas2 = scanner.nextInt();
        double precoUnit2 = scanner.nextDouble();

        double valorPago = (numeroPecas1 * precoUnit1) + (numeroPecas2 * precoUnit2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPago);

        scanner.close();
    }
}
