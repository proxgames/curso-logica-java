package src.main.java.org.training;

import java.util.Locale;
import java.util.Scanner;

public class uri1013problema {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int A, B, C;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();

        int valorMaior = (A + B + Math.abs(A-B)) /2;
        int valorMaior2 = (valorMaior + C + Math.abs(valorMaior - C)) /2;

        System.out.println(valorMaior2 + " eh o maior");

        scanner.close();
    }
}
