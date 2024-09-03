package desafios;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        int a = 0, b = 1, c = 0;

        while (c < numero) {
            c = a + b;
            a = b;
            b = c;
        }

        if (c == numero || numero == 0) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
