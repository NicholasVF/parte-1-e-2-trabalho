import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Digite a quantidade comprada: ");
        int quantidade = scanner.nextInt();
        double valorTotal = valorProduto * quantidade;
        System.out.println("O valor total da compra é: " + valorTotal);

    }
}
