package src.main.java.org.training;

import java.util.Locale;
import java.util.Scanner;

public class uri1011problema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double raioDaEsfera = scanner.nextDouble();
        double valorDePi = 3.14159;

        double volumeDaEsfera = 4.0/3 * valorDePi * Math.pow(raioDaEsfera, 3);

        System.out.printf("VOLUME = %.3f%n", volumeDaEsfera);

        scanner.close();
    }
}
