package src.main.java.org.training;

import java.util.Scanner;

public class uri1017problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tempoGasto = scanner.nextInt();
        int velocidadeMedia = scanner.nextInt();
        int distanciaPercorrida = tempoGasto * velocidadeMedia;

        double combustivelGasto = (double) distanciaPercorrida / 12;

        System.out.printf("%.3f%n", combustivelGasto);

        scanner.close();
    }
}
