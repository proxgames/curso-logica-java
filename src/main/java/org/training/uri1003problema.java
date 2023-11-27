package src.main.java.org.training;

import java.util.Scanner;

public class uri1003problema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();

        int SOMA = A + B;

        System.out.println("SOMA = " + SOMA);

        scanner.close();
    }
}
