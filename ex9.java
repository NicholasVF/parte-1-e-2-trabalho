import java.util.Scanner;

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        double desconto = valorProduto * 0.1;
        double valorComDesconto = valorProduto - desconto;
        System.out.println("O valor com 10% de desconto é: " + valorComDesconto);

    }
}
