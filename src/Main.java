import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = scanner.nextInt();

        int[] number = new int[n];

        for (int i = 0; i < n; i++ ) {
            System.out.print("Digite o número: ");
            number[i] = scanner.nextInt();
        }

        System.out.print("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++ ) {
            if (number[1] < 0 ) {
                System.out.println(number[1]);
            }
        }
        scanner.close();
    };
}

