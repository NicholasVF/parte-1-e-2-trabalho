import java.util.Scanner;

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        int multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação é: " + multiplicacao);
    }
}
