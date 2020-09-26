/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics;

import java.util.Scanner;

/**
 *
 * @author Tarun
 */
public class AccountTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Account savingsAccount = new Account("Savings", 200);
        System.out.printf("Account name: %s, current balace: $%.2f%n", savingsAccount.getName(), savingsAccount.getBalance());

        System.out.print("Enter deposit amount: ");
        double depositAmmount = scanner.nextDouble();
        savingsAccount.deposit(depositAmmount);
        System.out.printf("Account name: %s, current balace: $%.2f%n", savingsAccount.getName(), savingsAccount.getBalance());

        scanner.nextLine();
        
        System.out.println("Create account");
        
        System.out.print("Enter account name: ");
        String name = scanner.nextLine();
        System.out.println();

        Account account = new Account(name);
        System.out.printf("Account name: %s, current balace: $%.2f%n", account.getName(), account.getBalance());
    }
}
