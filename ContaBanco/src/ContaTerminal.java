import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Bem-vindo ao nosso banco!");
        
        System.out.println("Por favor, insira o seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Por favor, insira o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Por favor, insira a sua agência: ");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, insira o seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nome + " obrigada por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e o seu saldo " + saldo + " já está disponível para saque!");
        
    }
}
