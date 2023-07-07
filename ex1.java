import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        //Solicite ao usuário que digite dois números
        // inteiros e realize a soma entre eles. Em seguida, mostre o resultado
        Scanner scanner = new Scanner(System.in);
       int soma;
        System.out.println("Digite um numero inteiro");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro numero inteiro");
        int numero2 = scanner.nextInt();
       soma = numero1+ numero2;
        System.out.println("Soma dos numeros digitados:"+soma);

    }
}
