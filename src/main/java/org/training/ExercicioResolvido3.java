package src.main.java.org.training;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioResolvido3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String nome1 = scanner.next();
        int idade1 = scanner.nextInt();

        String nome2 = scanner.next();
        int idade2 = scanner.nextInt();

        double idadeMedia = (idade1 + idade2) / 2.0;

        System.out.printf("A idade media de %s e %s e de %.1f anos.", nome1, nome2, idadeMedia);

        scanner.close();
    }
}
