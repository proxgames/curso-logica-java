package src.main.java.org.training;

import java.util.Scanner;

public class uri1014problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int distancia = scanner.nextInt();
        double combustivelGasto = scanner.nextDouble();

        double totalGasto = distancia / combustivelGasto;

        System.out.printf("%.3f km/l%n", totalGasto);

        scanner.close();
    }
}
