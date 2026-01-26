import java.util.Scanner;

public class Prog3 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int n1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int n2 = entrada.nextInt();

        System.out.print("Digite o terceiro número: ");
        int n3 = entrada.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            System.out.println("O maior número é: " + n1);
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println("O maior número é: " + n2);
        } else {
            System.out.println("O maior número é: " + n3);
        }

        entrada.close();
    }
}
