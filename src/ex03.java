import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner leia = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int number = leia.nextInt();
        leia.nextLine();
        System.out.print("Enter account holder: ");
        String holder = leia.nextLine();
        System.out.print("Is there na initial deposit (y/n)? ");
        char option = leia.next().charAt(0);
        System.out.println();
        if (option == 'y') {
            System.out.print("Enter initial deposit value: ");
            double balance = leia.nextDouble();
            Product product = new Product(holder, balance, number);
            System.out.println();
            System.out.println("Account data: " + product);
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double amount = leia.nextDouble();
            product.Deposit(amount);
            System.out.println("Updated account data: ");
            System.out.println(product);
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            amount = leia.nextDouble();
            product.Withdraw(amount);
            System.out.println(product);
        }
        else if (option == 'n') {
            Product product = new Product(holder, number);
            System.out.println("Account data: " + product);
            System.out.println();
            System.out.print("Enter a deposit value: ");
            double amount = leia.nextDouble();
            product.Deposit(amount);
            System.out.println("Updated account data: ");
            System.out.println(product);
            System.out.println();
            System.out.print("Enter a withdraw value: ");
            amount = leia.nextDouble();
            product.Withdraw(amount);
            System.out.println(product);
        }

    }
}




