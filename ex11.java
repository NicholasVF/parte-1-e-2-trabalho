import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias que o carro foi alugado: ");
        int diasAluguel = scanner.nextInt();
        System.out.print("Digite o valor da diária: ");
        double valorDiaria = scanner.nextDouble();
        double valorTotal = diasAluguel * valorDiaria;
        System.out.println("O valor total do aluguel é: " + valorTotal);
    }
}
