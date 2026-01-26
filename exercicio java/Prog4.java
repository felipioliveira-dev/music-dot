import java.util.Scanner;

public class Prog4 {

    // Função para somar
    static int soma(int a, int b) {
        return a + b;
    }

    // Função para calcular a diferença (maior - menor)
    static int diferenca(int a, int b) {
        if (a > b) {
            return a - b;
        } else {
            return b - a;
        }
    }

    // Função para multiplicar
    static int produto(int a, int b) {
        return a * b;
    }

    // Função para dividir
    static int divisao(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Leitura dos números
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();

        // Menu
        System.out.println("\nEscolha uma opção:");
        System.out.println("A - Soma de 2 números");
        System.out.println("B - Diferença entre 2 números");
        System.out.println("C - Produto entre 2 números");
        System.out.println("D - Divisão entre 2 números");

        System.out.print("Opção: ");
        char opcao = entrada.next().charAt(0);

        // Verificação da opção
        if (opcao == 'A' || opcao == 'a') {
            System.out.println("Resultado: " + soma(num1, num2));

        } else if (opcao == 'B' || opcao == 'b') {
            System.out.println("Resultado: " + diferenca(num1, num2));

        } else if (opcao == 'C' || opcao == 'c') {
            System.out.println("Resultado: " + produto(num1, num2));

        } else if (opcao == 'D' || opcao == 'd') {

            if (num2 != 0) {
                System.out.println("Resultado: " + divisao(num1, num2));
            } else {
                System.out.println("Não é possível dividir por zero.");
            }

        } else {
            System.out.println("Opção inválida");
        }

        entrada.close();
    }
}
