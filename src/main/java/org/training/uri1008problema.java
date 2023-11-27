package src.main.java.org.training;

import java.util.Scanner;

public class uri1008problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int numeroHoras = scanner.nextInt();
        double valorHora = scanner.nextDouble();

        double salario = numeroHoras * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        scanner.close();
    }
}
