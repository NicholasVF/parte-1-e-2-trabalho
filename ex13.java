import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        double acrescimo = valorProduto * 0.15; // 15% de acréscimoimport java.util.Scanner;
        double valorComAcrescimo = valorProduto + acrescimo;

                System.out.println("O valor com acréscimo é: " + valorComAcrescimo);
    }
}
