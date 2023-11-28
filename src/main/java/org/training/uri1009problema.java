package src.main.java.org.training;

import java.util.Locale;
import java.util.Scanner;

public class uri1009problema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nomeVendedor = scanner.nextLine();
        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();

        double salarioComBonus = salarioFixo + totalVendas * 0.15;

        System.out.printf("TOTAL = R$ %.2f%n", salarioComBonus);

        scanner.close();
    }
}
