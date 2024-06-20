import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int num1 = terminal.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = terminal.nextInt();

            contar(num1, num2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: O segundo número deve ser maior que primeiro.");
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite apenas números inteiros.");
        } finally {
            terminal.close();
        }
    }

    static void contar(int num1, int num2) throws ParametrosInvalidosException {
        if (num2 < num1) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }

        for (int i = num1; i <= num2; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }

    static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String mensagem) {
            super(mensagem);
        }
    }
}
