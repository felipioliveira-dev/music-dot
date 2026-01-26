import java.util.Scanner;

public class Prog5 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double f = entrada.nextDouble();

        double c;
        c = (f - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + c);

        entrada.close();
    }
}
