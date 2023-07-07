import java.util.Scanner;

public class ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        int cubo = numero * numero * numero;
        System.out.println("O cubo do número é: " + cubo);
    }
}
