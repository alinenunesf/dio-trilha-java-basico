import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê o limite diário de saques
        System.out.println("Insira a quantidade de saques diarios que deseja autorizar: ");
        double limiteDiario = scanner.nextDouble();
        double limiteRestante = limiteDiario;

        // Loop para iterar sobre os saques
        for (int i = 1; ; i++) {
                
            System.out.println("Insira o valor que deseja sacar: ");
            double valorSaque = scanner.nextDouble();

            if (valorSaque == 0) {
                System.out.println("Transacoes encerradas.");
                break; // Encerra o loop
                
            } else if (valorSaque > limiteRestante) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break; // Encerra o loop
                
            } else {
                // Atualiza o limite diário restante
                limiteRestante -= valorSaque;
                
                // Imprime a saída no formato dos exemplos
                System.out.println("Saque realizado. Limite restante: " + limiteRestante);
            }
            
        }

        // Fecha o scanner para evitar vazamentos de recursos
        scanner.close();
    }
}