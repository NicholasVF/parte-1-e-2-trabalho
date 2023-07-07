import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de horas trabalhadas em um dia: ");
        double horasTrabalhadas = scanner.nextDouble();
        System.out.print("Digite o valor da sua hora de trabalho: ");
        double valorHora = scanner.nextDouble();
        double salarioDiario = horasTrabalhadas * valorHora;
        System.out.println("O salário diário é: " + salarioDiario);
    }
}