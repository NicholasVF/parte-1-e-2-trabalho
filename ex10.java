import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de litros de combustível abastecidos: ");
        double litros = scanner.nextDouble();
        System.out.print("Digite o valor do litro: ");
        double valorLitro = scanner.nextDouble();
        double valorTotal = litros * valorLitro;
        System.out.println("O valor total a ser pago é: " + valorTotal);
    }
}
