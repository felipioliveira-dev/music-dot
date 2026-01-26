import java.util.Scanner;

public class Prog1 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        int soma = n1 + n2;

        System.out.println("Resultado da soma: " + soma);

        if (soma > 100) {
            System.out.println("A soma é maior que 100");
        } else if (soma < 100) {
            System.out.println("A soma é menor que 100");
        } else {
            System.out.println("A soma é igual a 100");
        }

        entrada.close();
    }
}
