import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da agência.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite a agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo.");
        double saldo = scanner.nextDouble();

        System.out.println("Seja bem-vindo " + nomeCliente + ".\nSeus dados são: \nNúmero da conta: " + numero
                + "\nAgência: " + agencia + "\nSaldo: " + saldo);

    }
}
