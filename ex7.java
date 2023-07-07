import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de dias: ");
        int dias = scanner.nextInt();
        System.out.print("Digite a quantidade de horas: ");
        int horas = scanner.nextInt();
        System.out.print("Digite a quantidade de minutos: ");
        int minutos = scanner.nextInt();
        System.out.print("Digite a quantidade de segundos: ");
        int segundos = scanner.nextInt();
        int totalSegundos = (dias * 24 * 60 * 60) + (horas * 60 * 60) + (minutos * 60) + segundos;
        System.out.println("O total de segundos é: " + totalSegundos);
    }
}
