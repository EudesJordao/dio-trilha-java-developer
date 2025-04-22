package Desafios.ContaBanco;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String numeroAgencia = scanner.next();
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeTitular + "! Obrigado por abrir sua conta conosco. Sua agência é " + numeroAgencia + ", sua conta é " + numeroConta + " e seu saldo é de R$" + saldo + ".");

    }

}