import java.util.Scanner;

public class Fibonnaci {public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe um número para ser avaliado: ");
    int numero = scanner.nextInt();

    if (emFibonacci(numero)) {
        System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
    } else {
        System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
    }

    scanner.close();
}

    static boolean emFibonacci(int num) {
        int a = 0;
        int b = 1;

        while (b <= num) {
            if (b == num) {
                return true;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        return false;
    }
}
