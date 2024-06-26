import java.util.Scanner;

public class DesafioSimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("--- MENU INICIAL ---");
            System.out.println("Para deposito digite 1");
            System.out.println("Para saque digite 2");
            System.out.println("Para consultar o saldo digite 3");
            System.out.println("Para encerrar digite 0");

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                   //TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                  System.out.println("Insira o valor a ser depositado: ");
                  double deposito = scanner.nextDouble();
                  saldo += deposito;
                  System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                  System.out.println("Insira o valor a ser sacado: ");
                  double saque = scanner.nextDouble();
                  if (saque <= saldo){
                    saldo -= saque;
                    System.out.println("Saldo atual: " + String.format("%.1f", saldo));
                  }else {
                    System.out.println("Saldo insuficiente.");
                  }
                    break;
                case 3:
                  // TODO: Exibir o saldo atual da conta.
                  System.out.println("Saldo: " + String.format("%.1f", saldo));
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}