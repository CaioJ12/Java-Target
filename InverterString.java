import java.util.Scanner;

public class InverterString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String entrada = scanner.nextLine();

        String stringInvertida = inverterString(entrada);

        System.out.println("String Invertida: " + stringInvertida);

        scanner.close();
    }

    static String inverterString(String str) {
        char[] caracteres = str.toCharArray();
        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {
            char savePoint = caracteres[inicio];
            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = savePoint;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }
}
