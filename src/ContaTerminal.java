import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);

        // Variaveis
        int accountNumber;
        String agencyNumber;
        String clientName;
        float balance;

        // Inputs
        System.out.println("Please enter the Account number!");
        accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter the Agency number!");
        agencyNumber = scanner.nextLine();

        System.out.println("Please enter your name!");
        clientName = scanner.nextLine();

        System.out.println("Please enter the balance!");
        balance = scanner.nextFloat();
        scanner.nextLine();

        // Fechamento do scanner
        scanner.close();

        // Resultado
        System.out.println("Hello " + clientName + ", thank you for creating an account with our bank. " +
                "Your agency is " + agencyNumber + ", account number " + accountNumber + ", " +
                "and your balance of " + balance + " is already available for withdrawal.");
    }
}